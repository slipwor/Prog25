//Знакомство с объектами
class Avto {
	int pass; //Количество пассажиров, включая водителя
	int V; //Ёмкость топливного бака в л.
	double rash; //Расход топлива в л/100км

	Avto() {
		pass = 0;
		V = 0;
		rash = 0.0;
	}
	Avto(int p, int v, double r) {
		pass = p;
		V = v;
		rash = r;
	}

		     //Метод вычисления расстояния, которое автомобиль проедет на полном баке:	
	double range() {
		return ((double)(V*100))/rash;
	}

	double rashTopl(int km) {
		return (double)km*rash/100; 
	}

}
class ChkNum {
	boolean isEven(int x) {
		if((x%2) == 0) return true;
		else return false;
	}
}
class IsFact {
	boolean isFactor(int a, int b) {
		if((b%a) == 0) return true;
		else return false;
	}
}
class Pr008 {
	public static void main(String args[]) {
		double range;
		Avto bmw = new Avto();
		bmw.pass = 5;
		bmw.V = 80;
		bmw.rash = 12.5;
		
		System.out.println("\nИнформация о BMW X5: ");

		System.out.println("Количество пассажиров у BMV X5: " + bmw.pass);
		System.out.println("Объём бака  у BMW X5: " + bmw.V + " л");
		//Вызов метода вычисления расстояния внутри метода System.out.println():
		System.out.println("Расход топлива у BMW X5: " + bmw.rash + " л/100км" + "\nРасстояние для BMW: " + bmw.range() + "км");
		
		//range = (bmw.V * 100)/bmw.rash;

		range = bmw.range();
		System.out.println("BMW X5 проедет на полном баке " + range + " км");
		System.out.println("BMW X5 потратит на 100 км. " + bmw.rashTopl(100) + " литров топлива");
		
		int distance = 3350; //Расстояние до Москвы
		System.out.println("BMW X5 потратит " + bmw.rashTopl(distance) + " литров топлива, чтобы доехать до Москвы");
		
		System.out.println("\nИнформация о Mercedes SLC 43: ");

		Avto mercedes  = new Avto();
		mercedes.pass = 2;
		mercedes.V = 60;
		mercedes.rash = 10.2;
		System.out.println("Количество пассажиров у mercedes: " + mercedes.pass);
		System.out.println("Объём бака  у mercedes: " + mercedes.V + " л");
		System.out.println("Расход топлива у mercedes: " + mercedes.rash + " л/100км");
		
		//range = (mercedes.V * 100)/mercedes.rash;

		range = mercedes.range();
		System.out.println("Mercedes SLC 43 проедет на полном баке " + range + " км");

		System.out.println("Mercedes SLC 43 потратит " + mercedes.rashTopl(distance) + " литров топлива, чтобы доехать до Москвы");
		//Хранение значений в простых типах переменных 
		int p1 = 50, p2 = 75;
		p1 = p2;
		p2 = 100;
		System.out.println("Значения p1 и p2: " + p1 + " " + p2);

		//Хранение значений в объектных типах
		//Операции присваивания для объектных переменных означают копирование ссылки на объект, а не всех значений объекта
		Avto bmw1, bmw2;
		bmw1 = bmw;
		bmw2 = mercedes;
		bmw1.rash = 14.5;
		System.out.println("Расход для bmw и bmw1: " + bmw.rash + " " + bmw1.rash);
		bmw2.rash = 9.99;
		System.out.println("Расход для bmw2 и mercedes: " + bmw2.rash + " " + mercedes.rash);
		
		//Использование параметров при вызове метода 
		ChkNum e = new ChkNum();
		if(e.isEven(10)) System.out.println("10 - чётное");
		if(e.isEven(9)) System.out.println("9 - чётное");
		if(e.isEven(8)) System.out.println("8 - чётное");

		//Вызов метода с двумя параметрами
		IsFact x = new IsFact();
		if(x.isFactor(2, 20)) System.out.println("2 - делитель");
		if(x.isFactor(3, 20)) System.out.println("3 - делитель");
		if(x.isFactor(4, 20)) System.out.println("4 - делитель");


	}
}
