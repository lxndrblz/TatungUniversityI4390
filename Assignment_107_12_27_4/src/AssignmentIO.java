import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SeekableByteChannel;
import static java.nio.file.StandardOpenOption.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AssignmentIO {

	public static void main(String[] args) {
		readFile();
	}

	// Method for duplicating the ByteBuffer
	public static ByteBuffer clone(ByteBuffer original) {
		ByteBuffer clone = ByteBuffer.allocate(original.capacity());
		original.rewind();
		clone.put(original);
		original.rewind();
		clone.flip();
		return clone;
	}

	private static void readFile() {
		// Specify Path to file
		Path file = Paths.get("randomacfile.txt");

		// Use Channel for Read and Write Access
		try (SeekableByteChannel sbc = Files.newByteChannel(file, READ, WRITE)) {
			// Allocate Buffer according to size
			ByteBuffer buf = ByteBuffer.allocate((int) sbc.size());

			// Calculate the number of blocks and the maxIndx
			int maxBlock = 0;
			int maxIndex = 0;

			maxBlock = (int) Math.floor(sbc.size() / 4.0);
			maxIndex = (int) sbc.size();
			if (maxIndex % 4 != 0) {
				maxIndex = (maxBlock) * 4;
			}

			// Reads file encoding from System
			String encoding = System.getProperty("file.encoding");

			// Clone Buffer is necessary, because otherwise the put would override the
			// content to be copied later on
			ByteBuffer cop = clone(buf);
			// Still elements in buffer
			while (sbc.read(buf) > 0) {
				// Handle the last element properly
				for (int j = 0; j <= sbc.size(); j++) {
					// Position pointer to current index
					buf.position(j);
					CharBuffer old = Charset.forName(encoding).decode(buf);
					// Check if it is the last element
					if (j == maxIndex) {
						cop.put(j, (byte) old.get(0));

						// Write blocks always in chunks of four
					} else if (j % 4 == 0) {

						old.limit(4);
						int indexToReplaceWith = maxIndex - j - 4;
						buf.position(indexToReplaceWith);
						// Replacement Character
						CharBuffer nld = Charset.forName(encoding).decode(buf);
						// Change Buffer Mode
						buf.flip();
						// Put new element into buffer at correct position
						for (int i = 0; i < 4; i++) {
							cop.put(i + j, (byte) nld.get(i));

						}

					}
				}
				// Truncate file first and then write new buffer
				buf.flip();
				sbc.truncate(0);
				sbc.write(cop);

			}

		} catch (IOException x) {
			System.out.println("caught exception: " + x);
		}

	}
}
