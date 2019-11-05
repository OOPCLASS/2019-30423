package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorkingWithStrings {
	public static void main(final String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		// System.out.println("The current working directory is " + currentDirectory);
		try {
			var reader = new BufferedReader(new FileReader(currentDirectory + "\\src\\assignment1\\" + "testCases"));
			var line = reader.readLine();
			if(line != null) {
				processLine(line);
			}
			else {
				System.out.println(String.format("%s", line));
			}
			while (line != null) {
				// read next line
				line = reader.readLine();
				//processLine(line);
				if(line != null) {
					processLine(line);
				}
				else {
					System.out.println(String.format("%s", line));
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void processLine(String line) {
			line.trim();
			var res = line.split("[,\\ \\t]");
			int sizeOfResArr = res.length;
			String buf1;
			String buf2;
			if (sizeOfResArr == 1) {
				System.out.println(String.format("%s", res[0]));
			} else {
				if (sizeOfResArr == 2) {
					buf1 = String.valueOf(res[0]);
					res[0] = String.valueOf(res[1]);
					res[1] = String.valueOf(buf1);
					System.out.println(String.format("%s, %s", res[0], res[1]));
				} else {
					buf1 = String.valueOf(res[0]);
					res[0] = String.valueOf(res[sizeOfResArr - 1]);
					res[sizeOfResArr - 1] = String.valueOf(buf1);
					System.out.print(String.format("%s, ", res[0]));
					if (res[1].equals("Phd.") == false) {
						for (int i = 1; i < sizeOfResArr; i++) {
							System.out.print(String.format("%s ", res[i]));
						}
					} else {
						buf1 = String.valueOf(res[sizeOfResArr - 2]);
						res[sizeOfResArr - 2] = String.valueOf(res[sizeOfResArr - 1]);
						res[sizeOfResArr - 1] = String.valueOf(buf1);

						buf2 = String.valueOf(res[1]);
						res[1] = String.valueOf(res[sizeOfResArr - 1]);
						res[sizeOfResArr - 1] = String.valueOf(buf2);
						for (int i = 1; i < sizeOfResArr; i++) {
							System.out.print(String.format("%s ", res[i]));
						}
						System.out.print("\n");
					}
				}
			}
			System.out.print("\n");		
		}
}
