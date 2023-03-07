package java;
public class TwoDimension {
public static void main(String[] args) {
		// store login data into array
		String login [][]= new String[4][2];//four rows and two cells
		//first row first cell
		login[0][0]="Admin1";
		//first row second cell
		login[0][1]="Test1";
		//second row first cell
		login[1][0]="Admin2";
		//second row second cell
		login[1][1]="Test2";
		//third row first cell
		login[2][0]="Admin3";
		//third row second cell
		login[2][1]="Test3";
		//fourth row first cell
		login[3][0]="Admin4";
		//fourth row second cell
		login[3][1]="Test4";
		System.out.println(login.length);
		System.out.println(login[0].length);
		//iterate all rows
		for(int i=0;i<login.length;i++)
		{
			//iterate all cells in each row
			for(int j=0;j<login[i].length;j++)
			{
				System.out.print(login[i][j]+"\t");
			}
			System.out.println();
		}
	}
}









