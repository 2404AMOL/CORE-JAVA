class Char
{
	public static void main(String[] args) 
	{
		//Character always write in Single Coat ' '
		char ch1='A';
		char ch2='B';
		char ch3='a';
		char ch4='b';

		char ch5='c',ch6,ch7='C';

		//Character Datatype Have a ASCII Values.
		System.out.println(ch1);
		System.out.println(ch2);

		System.out.println(ch1+ch2);//It Add ASCII Values 65+66=131
		System.out.println('a'+'b');//97+98= 195
		System.out.println(ch1+ch3);//97+65
		System.out.println(ch1-ch3);//97-65
		System.out.println(ch1*ch3);//97*65
	}
}
/* Range : characters representation of ASCII values 0 to 255 */
/* Size = 16bits = 2 byte
/* Accepts :-
==> �a�
==> �\u0041�
==> �\101�
==> �\\�
==> �\�
==> �\n�
*/