
public class Array {
    
    public static void main(String[] args) {
        
        String kamar_hotel[][]= {
            {"*","*","*","*","X"},
            {"*","*","*","*","*"},
            {"*","*","*","*","*"},
            {"*","*","*","X","*"},
        };
       
        int kamar_kosong = 0;
        for(int j=0;j<kamar_hotel.length;j++){
            for(int i=0;i<kamar_hotel[j].length;i++){
                if("X".equals(kamar_hotel[j][i])){
                    System.out.println(" Tamu berada di Lantai " + (j+1) + " Kamar " + (i+1));
                }else {
                    kamar_kosong += 1;
                }
            }
        } System.out.println("");
        System.out.println("Jumlah kamar yang tersedia adalah " + kamar_kosong + " kamar");
    }
}