using System;

using System.CodeDom;

using System.Collections.Generic;

using System.Linq;

using System.Runtime.CompilerServices;

using System.Text;

using System.Text.RegularExpressions;

using System.Threading.Tasks;

namespace Zadachi

{

internal class Program

{

static double AreaRectangle(double a, double b)

{

return 2 a + 2 b;

}

static double UserFunction(double x, double y)

{

return ((x x) + 2 (y - 5) + 7);

}

static voi d UserFunction2(double a, double b)

{

double z, c, d;

z = a + b;

c = a - b;

d = a * b;

Console.WriteLine($"Pri vyvedeni x={a} i y={b}\nz=x+y={z}\nc=x-y={c}\nd=x*y={d}");

}

static void UserCircleAreaAndPerimeter(double r)

{

double areaCircle = Math.PI r r;

double perimCircle = Math.PI r 2;

Console.WriteLine($"Liceto i dyljinata na okryjnost s vyveden r={r}cm\nP={perimCircle:f2}cm\nArea={areaCircle:f2}cm*cm");

}

static double UserPoolFilledFunctionInMinutes(double w, double h, double l, double debit)

{

double poolVolumeInLitres = (w h l) / 1000;

double timeToFillInSec = poolVolumeInLitres / debit;

//Console.WriteLine(Math.Ceiling(timeToFillInSec / 60));

return Math.Ceiling(timeToFillInSec / 60);

}

static double UserNumberOfTripsToUnload(double numBricks, double numWorkers, double bricksPerWorker)

{

return Math.Ceiling(numBricks / (numWorkers * bricksPerWorker));

}

static bool UserDoesTriangleExist(double a, double b, double c)

{

if (a + b > c && a + c > b && b + c > a)

{

return true;

}

else return false;

}

static void UserWhatTypeOfTriangle(double a, double b, double c)

{

if (a == b)

{

if (b == c)

{

Console.WriteLine("Triygylnika e RAVNOSTRANEN\n");

}

Console.WriteLine("Triygylnika e RAVNOBEDREN\n");

}

else Console.WriteLine("Triygylnika e RAZNOSTRANEN\n");

}

static v oid UserSquareArea()

{

Console.WriteLine("Kvadrat:\nVyvedete razmer na a(cm): ");

double a = double.Parse(Console.ReadLine());

double area = a * a;

Console.WriteLine($"Liceto na Kvadrat sys razmeri:\na={a:f2}cm \nS={area:f2}cm squared");

}

static void UserRectangleArea()

{

Co nsole.WriteLine("Pravoygylnik:\nVyvedete razmer na a(cm): ");

double a = double.Parse(Console.ReadLine());

Console.WriteLine("Pravoygylnik:\nVyvedete razmer na b(cm): ");

double b = double.Parse(Console.ReadLine());

double area = a * b;

Console.WriteLine($"Liceto na Pravoygylnik sys razmeri:\na={a:f2}cm \nb={b:f2}cm \nS={area:f2}cm squared");

}

static void UserCircleArea()

{

Console.WriteLine("Kryg:\nVyvedete razmer na r(cm): ");

double r = double.Parse(Console.ReadLine());

double area = Math.PI r r;

Console.WriteLine($"Liceto na Kryg sys razmeri:\nr={r:f2}cm \nS={area:f2}cm squared");

}

static void UserTriangleArea()

{

Console.WriteLine("Triygylnik:\nVyvedete razmer na a(cm): ");

double a = double.Parse(Console.ReadLine());

Console.WriteLine("Triygylnik:\nVyvedete razmer na h(cm): ");

double h = double.Parse(Console.ReadLine());

double area = (a * h) / 2;

Console.WriteLine($"Liceto na Triygylnik sys razmeri:\na={a:f2}cm \nhb={h:f2}cm \nS={area:f2}cm squared");

}

static decimal UserConvertToUSD(decimal valueToConvert)

{

decimal toUSD = 1.77191m;

return valueToConvert / toUSD;

}

static decimal UserConvertToEUR(decimal valueToConvert)

{

decimal toEUR = 1.95583m;

return valueToConvert / toEUR;

}

static void Main(string[] args)

{

//********

//********

// Den 1: Lineini algoritmi.

//********

//********

/*

//======

// 1). Da se napishe programa, koqto ishislqva obikolka na pravoygylnik.

//======

Console.WriteLine ("vavedi a: ");

double a = double.Parse(Console.ReadLine());

Console.WriteLine("vavedi b: ");

double b = double.Parse(Console.ReadLine());

double result = AreaRectangle(a, b);

Console.WriteLine($"obikolkata na pravoygylnik sys strani:\n{a}cm i {b}cm \ne: {result}cm\n");

*/

/*

//======

// 2). Da se napishe programa, koqto reshava kvadratnata funkciq

// F=x*x+2*(y-5)+7, ako stoinostite na x i y za predvaritelno zadadeni.

//======

Console.WriteLine("vavedi x: ");

double a = double.Parse(Console.ReadLine());

Console.WriteLine("vavedi y: ");

double b = double.Parse(Console.ReadLine());

double result = UserFunction(a, b);

Console.WriteLine($"F=x*x+2*(y-5)+7 pri:\nx={a} i y={b}\nF={result}\n");

*/

/*

//======

// 3). Da se napishe programa, koqto izchislqva stoinostta na

// z, c i d pri dadeni x i y ako:

// z = x+y;

// c = x-y;

// d = x*y;

//======

Console.WriteLine("vavedi x: ");

double a = double.Parse(Console.ReadLine());

Console.WriteLine("vavedi y: ");

double b = double.Parse(Console.ReadLine());

UserFunction2(a, b);

*/

/*

//======

// 4). Da se napishe programa, koqto vyvecda radius i izchislqva

// Dyljinata i Liceto na okryjnostta.

// Za Dyljinata na okryjnostta se polzva formulata: 2*PI*r

// Za Liceto ba kryga se izpolzva formulata: PI*r*r (PI*r^2)

//======

Console.WriteLine("radius r: ");

double r = double.Parse(Console.ReadLine());

UserCircleAreaAndPerimeter(r);

*/

/*

//======

// 5). Basein A s razmeri a1,b1,v1 se pylni s voda prez tryba s debit d1 l/sek.

// Basein B s razmeri a2,b2,v2 se pylni s voda prez tryba s debit d2 l/sek.

// Za kolko obshto vreme shte se napylnqt s voda i dvata baseina? (1000 cm cubed = 1 litre)

//======

Console.WriteLine("a1(cm): ");

double a1 = double.Parse(Console.ReadLine());

Console.WriteLine("b1(cm): ");

double b1 = double.Parse(Console.ReadLine());

Console.WriteLine("v1(cm): ");

double v1 = double.Parse(Console.ReadLine());

Console.WriteLine("Debit na d1(l/sec): ");

double d1 = double.Parse(Console.ReadLine());

Console.WriteLine("a2(cm): ");

double a2 = double.Parse(Console.ReadLine());

Consol e.WriteLine("b2(cm): ");

double b2 = double.Parse(Console.ReadLine());

Console.WriteLine("v2(cm): ");

double v2 = double.Parse(Console.ReadLine());

Console.WriteLine("Debit na d2(l/sec): ");

double d2 = double.Parse(Console.ReadLine());

double timeToFillPool1 = UserPoolFilledFunctionInMinutes(a1, b1, v1, d1);

double timeToFillPool2 = UserPoolFilledFunctionInMinutes(a2, b2, v2, d2);

Console.WriteLine($"Pool1 with size:\na1= {a1}cm b1= {b1}cm v1= {v1}cm\nWill be filled in Time= {timeToFillPool1}min\n");

Console.WriteLine($"Pool2 with size:\na2= {a2}cm b2= {b2}cm v2= {v2}cm\nWill be filled in Time= {timeToFillPool2}min\n");

Console.WriteLine("Both pools with be filled for:\nTotalTime= {0}:{1}hrs\n", Math.Floor((timeToFillPool1+timeToFillPool2)/60), ((timeToFillPool1+timeToFillPool2)%60) );

*/

/*

//======

// 6). Stroitelni rabotnici trq bva da prenesat obshto X tuhli.

// Rabotnicite sa W na broi i rabotqt ednovrenenno. Te prevozvat tuhlite w kolichki, vsqka s vmestimost M tuhli.

// Napishete programa, koitato prochita celi chisla X, W i M i presmqta kolko naj-malko kursa

// trqbva da napravqt rabotnicite za da prevozqt tuhlite.

//======

Console.WriteLine("X(broi tuhli): ");

double x = double.Parse(Console.ReadLine());

Console.WriteLine("W(broi rabotni ci): ");

double w = double.Parse(Console.ReadLine());

Console.WriteLine("M(vmestimost broi tuhli na kolichka): ");

double m = double.Parse(Console.ReadLine());

double result = UserNumberOfTripsToUnload(x, w, m);

Console.WriteLine($"X={x}tuhli shte se prenesat ot \nW={w}rabotnika s \nM={m}broia tuhli w kolichka na rabotnik\nZa minimul {result} broia kursove!\n");

*/

/*

//======

// 7). Georgi poluchil zaplatata si v debitnata karta v razmer na 890lv

// Otishyl i se izteglil za djobni 200lv. Pri pribiraneto na izteglenata suma v djoba si nameril 1,50lv na moneti.

// Spomnil si sled tova, che ne e platen toka i prez bankomata izvyrshil plashtane kym dostavchika na elektro energia v razmer na 127,33lv.

// Sled rabota s bankomata, Georgi sedna v zavedenie i si porychal zapitka za 1,80lv.

// S kakva nalichnost e ostanal v bankomata si karta i v djoba sled napravenite operacii?

//======

double karta = 0;

double djobni = 0;

double iztegleni = 200;

double zaplata = 890;

double smetkaZaToka = 127.30;

double zaNapitka = 1.80;

double namereniStotinki = 1.50;

karta += zaplata;

djobni += iztegleni;

karta -= iztegleni;

djobni += namereniStotinki;

karta -= smetkaZaToka;

djobni -= zaNapitka;

Console.WriteLine($"Georgi e ostanal s: \nDjobni=\t{djobni:f2}lv.\nKarta=\t{karta:f2}lv.\nRazhodi={(zaNapitka + smetkaZaToka):f2}lv.\nPrivodi={(namereniStotinki + zaplata):f2}lv.\n");

*/

//********

//********

// Den 2: Razkloneni algoritmi.

//********

//********

/*

//======

// 1). Da se napishe programa, vyvejdashta tri realni chisla A, B, C, koito sa strani na trygylnika ABC.

// Neka programata dava otgovor dali susgtestvyva takyv triygylnik, i ako syshtestvyva dali e ravnostranen, ravnobedren ili raznostranen?

//======

Console.WriteLine("a(cm): ");

double a = double.Parse(Console.ReadLine());

Console.WriteLine("b(cm): ");

double b = double.Parse(Console.ReadLine());

Console.WriteLine("c(cm): ");

double c = double.Parse(Console.ReadLine());

if (UserDoesTriangleExist(a, b, c))

{

Console.WriteLine($"Triangle ABC exists with sides\na={a}c m b={b}cm c={c}cm");

UserWhatTypeOfTriangle(a, b, c);

}

else Console.WriteLine("No Triangle exist with give length of sizes!");

*/

/*

//======

// 2). Da se napishe programa, koqto vyvejda razmeite na geometrichna figura i presmqta liceto i.

// Figurite sa cheteri vida: kvadrat (square), pravoygylnik (rectangle), kryg (circle) i triygyl nik (triangle).

// Na pyrviq red na vhoda se chete vida na figurata (square, rectangle, circle or triangle).

// Ako figurata e kvadrat, na sledvashtiq red se chete edno chislo - dyljinata na stranata mu.

// Ako figurata e pravoygylnik, na sledvashtite dva reda chetat dve chisla - dyljinite na stranite mu.

// Ako figurata e kryg, na sledvashtiq red chete edno chislo - radiusa na kryga.

// Ako figurata e triygylnik na sledvashtite dva reda se chetat dve chisla - dyljinata na stranata mu i visochinata kym neq.

//======

Console.WriteLine("Vyvedi tip na figurata [square, rectangle, circle, triangle]");

string typeFigure = Console.ReadLine();

switch (typeFigure)

{

case "square": UserSquareArea(); break;

case "rectangle": UserRectangleArea(); break;

case "circle": UserCircleArea(); break;

case "triangle": UserTriangleArea( ); break;

default:

Console.WriteLine($"Invalid input for typeFigure={typeFigure}");

break;

}

*/

/*

//======

// 3). Da se napishe programa, koqto konvertira leva v duga valuta (EUR i USD). Da se zadavat stoinost za suma v leva

// i da se izb ira v kakva valuta da se nonvertira. Da se izpolzva valutnia kurs kakto sledva:

// 1 EUR = 1.95583 BGN

// 1 USD = 1.77191 BGN

//======

Console.WriteLine("Vyvedete Suma(BGN) za konvertirane ");

decimal sum = decimal.Parse(Console.ReadLine());

Console.WriteLine("Vyvedi v kakva valuta da se konvertira [USD, EUR]");

string convertTo = Console.ReadLine();

decimal result=0;

switch (convertTo)

{

case "USD":

result = UserConvertToUSD(sum);

Console.WriteLine($"Suma={sum}bgn is equal to {result} usd");

break;

case "EUR":

result = UserConvertToUSD(sum);

Console.WriteLine($"Suma={sum}bgn is equal to {result} eur");

break;

default:

Console.WriteLine("Neraznoznata valuta={0}\nVyzmojnite valuti za konvertira [USD, EUR] ", convertTo);

break;

}

*/

	//======
	// 4). Dadeno e cqlo chislo -broi tochki. Vyrhu nego se nachislkqvat bonus tochki po pravilata,
	// opisani po-dolu. Da se napishe programa, koqto presmqta bonus tochkite za tova chislo
	// i obshtiq broi tochki s bonusite.
	// - Ako chisloto e do 100 vkl., bonus tochkite sa 5.
	// - Ako e po-golqmo ot 100, bonus tochkite sa 20% ot chisloto
	// - Ako chisloto e po-golqmo ot 1000, bonus tochkite sa 10% ot chisloto.
	// Dopylnitelni bonus tochki (nachislqvat se otdelno to predhodnite):
	// Za chetno chislo: +1tochka.
	// Da se izvede chisloto i obshtiq broj tochki s bonusite.
	//======

	Console.WriteLine("Vyvedete cqlo chislo");
	int num = int.Parse(Console.ReadLine());
	int bonusTochki = 0;
	
	if(num<=100) {
		bonusTochki=5;
	}else if (num >1000) {
		bonusTochki += bonusTochki*0.10;
	}else {
		bonusTochki += bonusTochki*0.20;
	}
	if (num%2==0) {
		bonusTochki+=1;
	}
	Console.WriteLine($"Chiloto e {num}, obshto bonus tochki s {bonusTochki}\n");
	
	
	//======
	// 5). Hotel predlaga 2 vida stai: studio i apartament. Napishete programa,
	// koqto izchislqva cenata za celiq prestoi za studio i apartament. Cenite zavisqt ot meseca za prestoq:
	// May&Oct => studio (50.00lv/nosht); apartament (65.00lv/nosht)
	// June&Sept => studio (75.20lv/nosht); apartament (68.70lv/nosht)
	// July&Aug => studio (76.00lv/nosht); apartament (77.00lv/nosht)
	// Predlagat se slednite otstypki:
	// Za studio, pri poveche ot 7 noshtuvki prez mai i oktomvri : 5% namalenie.
	// Za studio, pri poveche ot 14 noshtuvki prez mai i oktomvri : 30% namalenie.
	// Za studio, pri poveche ot 14 noshtuvki prez juni i septemvri : 20% namalenie.
	// Za apartament, pri poveche ot 14 noshtuvki, bezznachenie ot meseca 10% namalenie.
	// Vhodyt se chete ot konzolata i sydyrja tochno 2 reda:
	// Na 1-viq red e mesecyt - [May, June, July, August, September, October]
	// Na 2-riq red e borqt noshtuvki - cqlo chislo v intervala [0...200]
	//======
	
	Console.WriteLine("Vyvedete mesec");
	string month = Console.ReadLine();
	Console.WriteLine("Vyvedete broi noshtuvki (cqlo chislo [0...200]");
	int nightsStayed = int.Parse(Console.ReadLine());
	double priceApartment = 0;
	double priceStudio = 0;
	double discount = 0;
	
	switch (month) {
		case "May":
		case "October": 
			priceStudio=50.00;
			priceApartment=65.00;
			if (nightsStayed > 7 && nightsStayed <= 14) {
				priceStudio = priceStudio - (priceStudio * 0.05);
			} else if (nightsStayed > 14) {
				priceStudio = priceStudio - (priceStudio * 0.30);
				priceApartment = priceApartment - (priceApartment * 0.10);
			}break;
		case "June":
		case "September": 
			priceStudio=75.20;
			priceApartment=68.70;
			if (nightsStayed > 14) {
				priceStudio = priceStudio - (priceStudio * 0.20);
				priceApartment = priceApartment - (priceApartment * 0.10);
			}break;
		case "July":
		case "August": 
			priceStudio=76.00;
			priceApartment=77.00;
			if (nightsStayed > 14) {
				priceApartment = priceApartment - (priceApartment * 0.10);
			}
			break;
		default:
			Console.WriteLine($"Invalid entry for month={month}\n");
			break;
	}
	Console.WriteLine("Apartment: %.2f lv.\nStudio: %.2f lv.\n", priceApartment*nightsStayed, priceStudio*nightsStayed);
	
//********
//********
// Den 3: Ciklichni algoritmi.
//********
//********


}

}

}