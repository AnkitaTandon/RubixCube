public class Load extends Cube {

	public static void main(String[] args) {
//declaration of data
 char Front[][]= new char[3][3];
 char Back[][]= new char[3][3];
 char Top[][]= new char[3][3];
 char Down[][]= new char[3][3];
 char Left[][]= new char[3][3];
 char Right[][]= new char[3][3];

Start obj = new Start();
Start f = new Start(Front);
Start b = new Start(Back);
Start u = new Start(Top);
Start d = new Start(Down);
Start l = new Start(Left);
Start r = new Start(Right);

Cube object = new Cube();
object.input(Front,Back,Left,Right,Top,Down);
object.U2();
object.output(Front,Back,Left,Right,Top,Down);

 //displaying data
 System.out.println("\n\n Result ");
 obj.display(Front);
 obj.display(Back);
 obj.display(Left);
 obj.display(Down);
 obj.display(Top);
 obj.display(Right);
}

}