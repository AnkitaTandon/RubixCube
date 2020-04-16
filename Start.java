import java.util.*;
public class Start {
	static int c = 0, cc=0;
Start(){
	System.out.println("\n\nWish to unscramble your Rubik's cube??\n\nCool! Follow me!\n\n STEP 1 : Pick up your 3X3 Rubik's Cube\n\n STEP 2 : Scramble it! ");
	System.out.println("\n STEP 3 : Input the configuration of the cube your holding.\n	Consider each face from top left to bottom right as a matrix. ");
	System.out.println("	Then enter the color of each bit in an appropriate order following the given notation :");
	System.out.println("	White - W			Blue - B\n	Yellow - Y			Orange - O\n	Green - G			Red - R");
}

Start(String junk){
	System.out.println(" "); //just for checking
}

Start(char face[][]){
	int i,j;
	c++;
	Scanner sc = new Scanner(System.in);
	switch(c){
		case 1:System.out.println("\n Front face :\n");break;
		case 2:System.out.println("\n Left face :\n");break;
		case 3:System.out.println("\n Right face:\n");break;
		case 4:System.out.println("\n Back face:\n");break;
		case 5:System.out.println("\n Top face:\n");break;
		case 6:System.out.println("\n Bottom face:\n");break;
		default :System.out.println(" \n");
		
	}
	for (i=0;i<3;i++){
		
		for (j=0;j<3;j++) {
			
			face[i][j]= sc.next().charAt(0);		
		}
	}
}

void display(char face[][]){
	int i,j;
	cc++;
	switch(c){
		case 1:System.out.println("\n Front face :\n");break;
		case 2:System.out.println("\n Left face :\n");break;
		case 3:System.out.println("\n Right face:\n");break;
		case 4:System.out.println("\n Back face:\n");break;
		case 5:System.out.println("\n Top face:\n");break;
		case 6:System.out.println("\n Bottom face:\n");break;
		default :System.out.println(" \n");
		
	}
	for (i=0;i<3;i++){
		for (j=0;j<3;j++) 
			System.out.print(" "+face[i][j]);
		System.out.println("");
	}
}
}