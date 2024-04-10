public class Arrpractice {
    public static void main(String[] args) {
        //practice problem 1
        // float [] marks ={45.7f,67.8f,99.2f,100.0f,66.6f};
        // float sum =0;
        // for(float element:marks){
        //     sum =sum+element;
        // }
        // System.out.println("the value of sum is :"+ sum);


        //problem 2
      //practice problem 1
//       float [] marks ={45.7f,67.8f,99.2f,100.0f,66.6f};
//       float num =45.7f;
//       boolean isArray = false;
//       for(float element:marks){
//         if(num ==element){
// isArray =true;
// break;
//         }
//     }
//         if(isArray){
//             System.out.println("the value present in the array");
//         }else{
//             System.out.println("The value is not present in the array");
//         }
      
    //problem4
        float [] marks ={45.7f,67.8f,99.2f,100.0f,66.6f};
        float sum =0;
        for(float element:marks){
            sum =sum+element;
        }
        System.out.println("the value of sum is :"+ sum/marks.length);

//         //problem5 1
//         int [][] mat1 = {{1, 2, 3},
//         {4, 5, 6}};
// int [][] mat2 = {{12, 6, 6},
//         {3, 6, 8}};
// int [][] result = {{0, 0, 0},
//            {0, 0, 0}};

// for (int i = 0; i < mat1.length; i++) {
// for (int j = 0; j < mat1[i].length; j++) {
// System.out.print(result[i][j] + " ");
// result[i][j] = mat1[i][j] + mat2[i][j];
// }
// System.out.println("");
// }

//problemno5
int [] arr = {1,2,3,4,5,7};
int l =arr.length;
int n = Math.floorDiv(l, 2);
int temp;
for(int i=0;i<n;i++){
    temp=arr[i];
    arr[i]=arr[l-i-1];
    arr[l-i-1]=temp;
}
for(int element:arr){
    System.out.println(element+"");
}
    }
}
