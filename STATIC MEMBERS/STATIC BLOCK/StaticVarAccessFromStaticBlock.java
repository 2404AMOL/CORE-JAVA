//QNO2:-Can We Acces The A Static Variable From A Static block?In How Many Ways?

class StaticVarAccessFromStaticBlock 
{
	static int a=100;

	static
	{//Static Block
		System.out.println(a);//Directly Access using Variable Name
		System.out.println(StaticVarAccessFromStaticBlock.a);//Accces Static Varible Class Name As a Rreference
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
-->>100										*
-->>Hello World!							*
*********************************************/