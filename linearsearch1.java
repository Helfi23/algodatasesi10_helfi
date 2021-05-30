public class linearsearch1 {
    
    public static void main(String[] args) {
        int[] angka ={10, 2, 29, 13, 15, 6, 3};
        boolean ditemukan = false;
        int nomor = 15;
        
        for(int i=0;i<angka.length;i++){
            if(nomor == angka[i]){
                System.out.println("Data diperoleh pada index ke-" + i);
                ditemukan = true;
                break;
                
            }
        }
        if(ditemukan == false){
            System.out.println("Data tidak ketemu");
        }
    }
    
}