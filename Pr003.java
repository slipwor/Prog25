class Pr003 {
	public static void main(String args[]) {
		
		//Объявление целых переменных
		int var1, var2 = 20;
		
		//Объявление логической переменной
	        boolean varb=true;
		
		//Объявление вещественных переменных
		double vard1=10.3, vard2;
		var1 = 10;
		
		//Проверка условия
		if (var1>var2) {
			int var3= 300;
			System.out.println(var3);
		}
		else {
			int var4 = 300;
			System.out.println(var4);
		}
		if (varb) {
			System.out.println(var1);
		}
		
		//Деление двух целых чисел
		System.out.println("Результат деления var1 на var2");
		System.out.println(var1/var2); 

		//Приведение результата деления к типу double
		vard2 = (double)var1/var2;
		System.out.println("Результат деления var1 на var2 с явным преобразованием к double");
		System.out.println(vard2);

		//Простые типы данных в java
		byte byte_var;
		System.out.println("Значения byte_var:");
		for (int i=100; i<=150; i++) {
			byte_var=(byte)i;
			System.out.print(byte_var + ", ");
		}
		
		short short_var;
		System.out.println("Тип данных short имеет разрядность 16 бит и значения от -32 768 до 32 767");
		System.out.println("Тип данных int имеет разрядность 32 битa");
		System.out.println("Тип данных long имеет разрядность 64 бита");

	}
}
