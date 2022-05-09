package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonWriteMain {
//person 데이터를 5개 입력받고 입력받은 데이터는 arraylist에 저장한후 리스트가 가지고있는 데이터를 저장
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("Person.dat");
			oos = new ObjectOutputStream(fos);

			for (int i = 0; i < 5; i++) {
				System.out.println("이름 : ");
				String name = sc.nextLine();
				System.out.println("나이 :");
				int age = sc.nextInt();
				sc.nextLine();
				list.add(new Person(name, age));
			}

			// 이렇게해도됨 oos.writeObject(list); oos.flush();
			for (Person p : list) {
				oos.writeObject(p);
			}
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
