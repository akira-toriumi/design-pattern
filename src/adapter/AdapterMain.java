package adapter;

import adapter.common.StandardLevelIF;
import adapter.common.impl.Akun;
import adapter.common.impl.Bkun;
import adapter.common.impl.Ckun;
import adapter.common.impl.Level2;

public class AdapterMain {

	public static void main(String[] args) {

		Level1 obj1 = new Level1();
		System.out.println(obj1.getLevel1Logic());

		StandardLevelIF standard = new Akun();
		System.out.println(standard.getLogic());
		standard = new Bkun();
		System.out.println(standard.getLogic());
		standard = new Ckun();
		System.out.println(standard.getLogic());

		// Standardを実装して、さらに進化
		Level2 obj2 = new Level2();
		System.out.println(obj2.getLevel1Logic());
		System.out.println(obj2.getLogic());
	}

}
