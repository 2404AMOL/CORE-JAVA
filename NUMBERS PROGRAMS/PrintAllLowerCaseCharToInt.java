//QNO8:-Write A Program To Print All The Lowercase Characters Into Integer Format
class PrintAllLowerCaseCharToInt  
{
	public static void main(String[] args) 
	{
		char ch='a';
		int ASCII;

		while (ch<='z')
		{
			System.out.print(ch+"=");
			ASCII=ch;
			ch++;

			System.out.println(ASCII);
		}

	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>97
-->>98
-->>99
-->>100
-->>101
-->>102
-->>103
-->>104
-->>105
-->>106
-->>107
-->>108
-->>109
-->>110
-->>111
-->>112
-->>113
-->>114
-->>115
-->>116
-->>117
-->>118
-->>119
-->>120
-->>121
-->>122
*************************************************/