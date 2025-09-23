//Управляющие операторы
class Pr006 {
	public static void main(String args[])
	    throws java.io.IOException {
	    //Клавиатурный ввод символов	
    		char ch, temp=' ';

		System.out.println("Введите символ с клавиатуры: ");
		ch = (char) System.in.read();
		System.out.println("Введён символ: " + ch);
		for (;temp != '\n';)
			temp = (char) System.in.read();
			
		//Угадывание значения символьной переменной
		/*
		char answer = 'D';
		System.out.println("Введите символ ...");
		ch = (char)  System.in.read();
		
		//Демонстрация работы оператора if()
		
		if (ch == answer)
			System.out.println("Символы совпали");
		else { 
			System.out.println("Символы не совпали " + ch);
			if (ch < answer)
				System.out.println("Нужный символ ближе к концу алфавита");
			else 
				System.out.println("Нужный символ ближе к началу алфавита");
		}

		*/

		System.out.println();
		//Вложенный оператор if()
		int i = 10, j = 15, k = 15, a = 0, b = 77, c = 0, d = 88;
		if(i != 10) {
			if(j < 20) 
				a = b;
			if(k > 100) 
				c = d;
			else {
				c = 25;
				a = c;
			}
		}
		else {
			a = d; 
			c = 0;
		}
		System.out.println("i = " + i + " j = " + j + " k = " + k);
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		
		//Многоступенчатая конструкция if-else-if
		System.out.println();
		for(i=0; i<6; i++) {
			if(i==1)
				System.out.println("i = 1");
			else if(i == 2)
				System.out.println("i = 2");
			else if(i == 3)
				System.out.println("i = 3");
			else if(i == 4)
				System.out.println("i = 4");
			else
				//Все оставшиеся варианты выведут значение, указанное ниже
				System.out.println("Значение i не равно ни одному значению от 1 до 4");
		}

		//Оператор switch
		System.out.println("\nДемонстрация работы оператора switch()");
		for(i=0; i<10; i++)
			switch(i) {
				case 0:
					System.out.println("i = 0");
					break;
				case 1:
					System.out.println("i = 1");
					break;
				case 2:
					System.out.println("i = 2");
					break;
				case 3: 
					System.out.println("i = 3");
					break;
				case 4:
					System.out.println("i = 4");
					break;
				default:
					System.out.println("i >= 5");
					
			}

		//Вложенные операторы switch
		System.out.println();
		char ch2 = 'R';
		char ch1 = 'A';
		switch(ch2) {
			case 'A':
				System.out.println("Значение А внешнего оператора switch");
				  switch(ch1) {
					case 'A':
						System.out.println("Значение А внутреннего оператора switch");
						break;

				  }
				  break;
			case 'R':
				  System.out.println("Значение R внешнего оператора switch");
				    switch(ch1) {							                                  case 'A':
				 		System.out.println("Значение А внутреннего оператора switch");					  break;
                                    }
 				    break;
                        default:
				    System.out.println("Значение по умолчанию для внешнего switch()");

        	}		

		//Оператор цикла for
		System.out.println();
		double num, sroot, rerr;

		for(num = 1.0; num < 100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Квадратный корень из " + num + " равен " + sroot);

			//Вычисление ошибки округления
			rerr = num - (sroot * sroot);
			System.out.println("Ошибка округления: " + rerr);
			System.out.println();
		}

		System.out.println();
		int x;
		for(x = 100; x > -100; x -= 5)
			System.out.println(x);

		System.out.println("\nПример цикла, тело которого не выполняется ни разу");
		for(x = 100; x > 100; x -= 5)
			System.out.println(x);
		System.out.println("После цикла for");

		System.out.println();

		for(i=0, j=10; i < j; i++, j--)
			System.out.println("i = " + i + " j = " + j);

		//Чтение символов с клавиатуры внутри цикла for
		System.out.print("\nВведите \'S\' для остановки цикла чтения с клавиатуры ");
		for(i=0; (char) System.in.read() != 'S'; i++) {
			System.out.println("Интерация №" + i);
			System.out.print("Введите символ: ");
			temp = (char) System.in.read();
		}
		System.out.println();

		//Пропуск отдельных частей в определении цикла for
		System.out.println();
		for(i=0; i<10;) {
			System.out.println("Интерация №" + i );
			i++; 
		}

		//Бесконечный цикл
		System.out.println();
		for(;;) {
			System.out.println("Интерация");
			System.out.println("Для остановки цикла введите \'q\'");
			temp = (char) System.in.read();
			if (temp == 'q')
				break;
		}

		//Циклы без тела
		System.out.println();
		int sum = 0;
		for(i = 1; i <= 5; sum += i++);
		System.out.println("Значение sum: " + sum);

		//Объявление параметра цикла внутри цикла
		for(int ii = 1; ii <= 10; sum += ii++);
		System.out.println("Значение sum: " + sum);
		//System.out.println("Значение ii: " + ii);
	}
}
