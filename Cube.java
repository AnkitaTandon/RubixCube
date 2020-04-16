public class Cube extends Start {
    
    static int i,j;
    static int count=0;
    static char f[][], b[][], l[][],r[][],u[][],d[][];

    public void input(char front[][], char back[][],char left[][], char right[][],char up[][], char down[][]){
        f=front;
        b=back;
        l=left;
        r=right;
        u=up;
        d=down;
    } 

    public void output(char front[][], char back[][],char left[][], char right[][],char up[][], char down[][]){
        front=f;
        back=b;
        left=l;
        right=r;
        up=u;
        down=d;
    } 

    public void U2(){
        count++;
        System.out.println("Move Up face clockwise twice");
        for(i=0;i<3;i++){
            swap(f[0][i],b[0][i]);
            swap(l[0][i],r[0][i]);
            
        }    inswap(u);
     
    }

    public static void D2(){  
        count++;
        System.out.println("Move Down face clockwise twice");
        for(i=0;i<3;i++){
            swap(f[2][i],b[2][i]);
            swap(l[2][i],r[2][i]);
        }    inswap(d); 

    }

    public static void L2(){
       
        count++;
        System.out.println("Move Left face clockwise twice");
        for(i=0,j=2;i<3;j--,i++){
            swap(f[i][0],b[j][2]);
            swap(u[i][0],d[i][0]);
        }     inswap(l);

    }

    public static void R2(){
       
      count++;
        System.out.println("Move Right face clockwise twice");
        for(i=0,j=2;i<3;i++,j--){
            swap(f[i][2],b[j][0]);
            swap(u[i][2],d[i][2]);
        }     inswap(r);

    }

    public static void F2(){
       
        count++;
        System.out.println("Move front face clockwise twice");
        for(i=0,j=2;i<3;j--,i++){
            swap(u[2][j],d[0][i]);
            swap(r[j][0],l[i][2]);
        }     inswap(f);

    }

    public static void B2(){
   
        count++;
        System.out.println("Move back face clockwise twice");
        for(i=0,j=2;i<3;j--,i++){
            swap(u[0][i],d[0][i]);
            swap(l[j][0],r[i][2]);
        }     inswap(b);

    }

    public static void B(){

        count++;
        System.out.println("Move back face clockwise");
        for(i=0,j=2;i<3;j--,i++){
           cyclic(u[0][i],r[i][2],d[2][j],l[0][j]);
        }    incyclic(b,1);

    }

    public static void F(){
          
        count++;
        System.out.println("Move front face clockwise");
        for(i=0,j=2;i<3;i++,j--){
           cyclic(u[2][j],l[2][i],d[0][i],r[j][0]);
        }     incyclic(f,1);

    }public static void L(){
        
        count++;
        System.out.println("Move back face clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(u[j][0],b[i][2],d[j][0],f[j][0]);
         }    incyclic(l,1);

    }public static void R(){
       
        count++;
        System.out.println("Move back face clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(u[i][2],f[i][2],d[i][2],b[j][0]);
         }  incyclic(r,1);  

    }public static void U(){
        
        count++;
        System.out.println("Move back face clockwise");
        for(i=0;i<3;i++){
            cyclic(l[i][2],f[0][2],r[i][2],b[i][0]);
         }   incyclic(u,1); 

    }public static void D(){
        
        count++;
        System.out.println("Move back face clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(r[2][j],f[2][j],l[2][j],b[2][j]);
         }    incyclic(d,1);

    }public static void B1(){
         
        count++;
        System.out.println("Move back face anti-clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(u[0][j],l[i][0],d[2][i],r[j][2]);
         }     incyclic(b,0);

    }public static void F1(){
      
        count++;
        System.out.println("Move front face anti-clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(u[2][i],r[i][0],d[0][j],l[j][2]);
         } incyclic(f,0);

    }public static void U1(){
       
        count++;
        System.out.println("Move up face anti-clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(f[0][j],l[0][j],b[0][j],r[0][j]);
         }     incyclic(u,0);

    }public static void D1(){
        
        count++;
        System.out.println("Move down face anti-clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(b[2][i],l[2][i],f[2][i],r[2][i]);
         }     incyclic(d,0);

    }public static void L1(){
       
        count++;
        System.out.println("Move left face anti-clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(u[i][0],f[i][0],d[i][0],b[j][2]);
         }   incyclic(l,0);

    }public static void R1(){
        
        count++;
        System.out.println("Move right face anti-clockwise");
        for(i=0,j=2;i<3;i++,j--){
            cyclic(u[j][2],b[i][0],d[j][2],f[j][2]);
         }     incyclic(r,0);

    }


    public static void swap(char a, char b){
        char temp;
        temp=a;
        a=b;
        b=temp;
    }
    
    public static void inswap(char a[][]){
        for(i=0,j=2;i<3;j--,i++){
            swap(a[0][i],a[2][j]);
        }     
        swap(a[1][0],a[1][2]); 
    }
    public static void cyclic(char a, char b,char c, char d){
        char temp;
        temp=a;
        a=b;
        b=c;
        c=d;
        d=temp;
    }

    public static void incyclic(char a[][], int flag){
        char temp;
        for(i=0,j=2;i<2;i++,j--)
            if(flag==1){
            temp=a[i][0];
            a[i][0]=a[2][i];
            a[2][i]=a[j][2];
            a[j][2]=a[0][j];
            a[0][j]=temp;
        }
            else{
                temp=a[i][0];
                a[i][0]=a[i][2];
                a[i][2]=a[2][j];
                a[2][j]=a[2][i];
                a[2][i]=temp; 
            }
    }
}