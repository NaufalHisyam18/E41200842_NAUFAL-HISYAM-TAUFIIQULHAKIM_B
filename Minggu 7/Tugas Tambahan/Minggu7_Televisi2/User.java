package Minggu7_Televisi2;
/**
 *
 * @author naufal
 */
public class User {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("TV LG , 42 inc" ,12);
        
       String [] semuaChannel = {"METRO TV","RCTI","TPI","TRANS TV",
                                 "TRANS 7", "SCTV", "INDOSIAR","ANTV",
                                 "TVRI","BAYU TV","JTV"};
       
        System.out.println("Naufal, membeli Televisi : "+ tv.getDeskripsi());
       
        tv.getChannels();
        tv.setChannels(semuaChannel);
       
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        
        tv.setModusTampilan(TelevisiModern.TELETEXT);
       tv.setHalamanTeleText(250); 
        tv.setModusTampilan(TelevisiModern.tV);
       tv.playCD();
       tv.setDiscTray("The Matrix");
       tv.playCD();
    }
    
}