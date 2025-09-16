class Pr004 {
	public static void main(String agrs[]) {
		//Арифметические операции
		System.out.println("Знак операции\tВыполняемое действие");
		System.out.println("+\t\tСложение\n-\t\tВычитание\n*\t\tУмножение\n/\t\tДеление");
		System.out.println("%\t\tДеление по модулю\n++\t\tИнкремент\n--\t\tДекремент");
		//Операции сравнения 
		System.out.println("\nЗнак операции\tВыполняемое действие");
		System.out.println("==\t\tРавенство\n!=\t\tНеравенство\n>\t\tБольше\n<\t\tМеньше");
		System.out.println(">=\t\tБольше или равно\n<=\t\tМеньше или равно");

		//Логические операции
		System.out.println("\nЗнак операции\tВыполняемое действие");
		System.out.println("&\t\tИ\n|\t\tИЛИ\n^\t\tИсключающее ИЛИ");
		System.out.println("&&\t\tУкороченное И\n||\t\tУкороченное ИЛИ\n!\t\tНЕ");
		//Примеры выполнения логических операций
		System.out.println();
		System.out.println("p\tq\tp&q\tp|q\tp^q\t!p");
		boolean p=false, q = false;
		System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p);
		p = true;
		System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p);
		q = true; p = false;
		System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p);
		p = true;
		System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + !p);

		//Применение оператора if с операциями сравненияи с логическими операциями
		System.out.println();
		int a1, a2;
		boolean b1, b2;
		
		a1=10;
		a2=11;
		if(a1 < a2) System.out.println("a1 < a2");
		if(a1 <= a2) System.out.println("a1 <= a2");
		if(a1 != a2) System.out.println("a1 != a2");
		if(a1 >= a2) System.out.println("Не выполняется");
		if(a1 == a2) System.out.println("Не выполняется");
		if(a1 > a2) System.out.println("Не выполняется");

		b1 = true;
		b2 = false;
		if(b1 & b2) System.out.println("Не выполняется");
		if(!(b1 & b2)) System.out.println("!(b1 & b2): true");
		if(b1 | b2) System.out.println("b1 | b2: true");
		if(b1 ^ b2) System.out.println("b1 ^ b2: true");

		//Применение укороченных логических операций:
		System.out.println();
		int n, d;
		n = 10;
		d = 2;
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " является делителем " + n);

		d = 0;
		if(d != 0 && (n % d) == 0)
			System.out.println(d + "является делителем" + n);

		//Обычный логический оператор:
		/*
		if(d != 0 & (n % d) == 0)
			System.out.println(d + "является делителем" + n);
		*/

	}
}

