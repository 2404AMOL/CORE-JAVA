//QNO3:-Can We Initailize The Static Variable From A Static block?In How Many Ways?

class StaticVarInitializeFromStaticBlock 
{
	static int a;

	static
	{//Static Block
		a=100;
		System.out.println(a);//Directly Access using Variable Name
		StaticVarInitializeFromStaticBlock.a=200;
		System.out.println(StaticVarInitializeFromStaticBlock.a);//Accces Static Varible Class Name As a Rreference
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>100										*
-->>200										*
-->>Hello World!							*
*********************************************/