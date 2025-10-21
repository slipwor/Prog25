class Queue {
	char q[]; //Ссылка на массив, хранящий элементы очереди
	int putloc, getloc; //Указатели на начало и на конец очереди
	
	Queue(int size) {
		q = new char[size+1]; //Выделение памяти для массива
		putloc = getloc = 0;
	}

	//Метод для помещения символа в очередь
	void put(char ch) {
		if(putloc == q.length-1) {
			System.out.println(" - Очередь заполнена");
			return;
		}

		putloc++;
		q[putloc] = ch;
	}

	//Метод для извлечения символа из очереди
	char get() {
		if(getloc == putloc) {
			System.out.println(" - очередь пуста");
			return (char) 0;
		
	}

		getloc++;
		return q[getloc];
	}
	
}

class QDemo {
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("Использование очереди bigQ для сохранения букв алфавита");
		for(i=0; i<32; i++)
			bigQ.put((char) ('А' + i));
		
		System.out.print("Содержимое очереди bigQ: ");
		for(i=0; i<32; i++) {
			ch = bigQ.get();
			if(ch != (char) 0)
				System.out.print(ch);

		}
		System.out.println("\n");

		System.out.println("Использование очереди smallQ для демонстрации переполнения ");
		for(i = 0; i < 5; i++) {
			System.out.print("Попытка сохранения " + (char) ('Я' - i));

			smallQ.put((char) ('Я' - i));
			System.out.println();
		}
		System.out.println();

		System.out.println("Демонстрация попытки обращения к пустой очереди");
		System.out.println("Содержимое очереди smallQ: ");
		for(i=0; i<5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0)
				System.out.print(ch);

		System.out.println("Попытки вставки символов в пустую очередь smallQ: ");
		}

		for(i = 0; i < 5; i++) {
			System.out.print("Попытка сохранения " + (char) ('Я' - i));

			smallQ.put((char) ('Я' - i));
			System.out.println();
		}
	}
}
