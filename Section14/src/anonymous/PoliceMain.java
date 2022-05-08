package anonymous;

public class PoliceMain {

	public static void main(String[] args) {
		Gun gun = new Gun() {

			private int bullet = 10;

			@Override
			public void shot() {
				if (bullet > 0) {
					bullet--;
					System.out.println("bang!");
				} else {
					reload();
				}
			}

			@Override
			public void reload() {
				bullet = 10;
				System.out.println("reload!");
			}
		};

		for (int i = 0; i < 15; i++)
			gun.shot();
		

		Police police = new Police(gun);
		police.changeGun(new Gun() {

			@Override
			public void shot() {
				System.out.println("bangbang");
			}

			@Override
			public void reload() {
				System.out.println("reload");
			}
		});
		police.shot();
		police.shot();
		
	}

}
