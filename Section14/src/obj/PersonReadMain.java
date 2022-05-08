package obj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonReadMain {
//person.dat 파일에 있는 내용을 objectinputstream, fileinputstream을 이용하여 
//저장된 내용을 전부 읽어와서 화면에 tostring을 이용해서 화면에 출력

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("Person.dat");
			ois = new ObjectInputStream(fis);
			try {
				while (true) {
					Person p = (Person) ois.readObject();
					System.out.println(p);
				}
			} catch (EOFException e) {
			System.out.println("파일 읽기 완료");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
