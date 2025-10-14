class Help2{
	void helpon(int what) {
		switch(what) {
			case '1':
				System.out.println("Оператор if:\n");
				System.out.println("if(логическое выражение) оператор;");
				System.out.println("else оператор;");
				break;
				
			case '2':
				System.out.println("Оператор switch:\n");
				System.out.println("switch(выражение) {");
			 	System.out.println(" case константа:");
			 	System.out.println(" последовательность операторов");
				System.out.println(" break;");
				System.out.println(" // ...");
				System.out.println("}");
				break;

			case '3':
				System.out.println("Оператор for:\n");
				System.out.println("for(инициализация; условие; итерация)");
				System.out.println(" оператор;");
				break;
			case '4':
				System.out.println("Оператор while:\n");
				System.out.println("while(условие) оператор;");
				break;
			case '5':
				System.out.println("Оператор do-while:\n");
				System.out.println("do {");
				System.out.println(" оператор;");
				System.out.println("} while (условие);");
				break;
			case '6':
				System.out.println("Оператор break:\n");
				System.out.println("break; или break метка;");
				break;
			case '7':
				System.out.println("Оператор continue:\n");
				System.out.println("continue; или continue метка;");
				break;
		}
		System.out.println();

	}

	void showmenu() {

				System.out.println("Справочная система");
				System.out.println(" 1. if");
				System.out.println(" 2. switch");
				System.out.println(" 3. for");
				System.out.println(" 4. while");
				System.out.println(" 5. do-while");
				System.out.println(" 6. break");
				System.out.println(" 7. continue");

				System.out.print("Выберите номер нужного пункта (для выхода нажмите q): ");
	}

	boolean isvalid(int ch) {
		if(ch < '1' | ch > '7' & ch != 'q') return false;
		else return true;
	}

}

class HelpClass {
	public static void main(String args[])
	  throws java.io.IOException {
	  
	  char choice, temp;

		Help2 hlpobj = new Help2();

		for(;;) {
			do {
				hlpobj.showmenu();

				choice = (char) System.in.read();

				do {
					temp = (char) System.in.read();
				} while (temp != '\n');
			} while (!hlpobj.isvalid(choice));

			if(choice == 'q')
				break;

			System.out.println("\n");

			hlpobj.helpon(choice);
		}
	}
}
