package Minggu7_Televisi1;
/**
 *
 * @author naufal
 */
public class Televisi {
    private String deskripsi; //Deskripsi: untuk menyimpan nama/ deskripsi dari televisi
    private int jumlahChannel; //JumlahChannel: untuk menyimpan banyaknya channel yang dapat disimpan oleh televisi
    private String[] channels = null; //Channels: untuk menyimpan data-data channel televisi yang sudah diset
    private int channelAktif; //ChannelAktif untuk menyimpan nomor channel yang sedang aktif saat ini
    private int volume; //Volume: untuk menyimpan informasi besarnya volume televisi

    public Televisi(String deskripsi, int jumlahChannel){
    this.deskripsi = deskripsi;
    this.jumlahChannel = jumlahChannel;
    }
    public String getDeskripsi(){
    return deskripsi;
    }
    
    public int getJumlahChannel(){
    return jumlahChannel;
    }
    public String[] getChannels(){
    if(channels == null) {
    System.out.println("Belum ada channel yang diset ! ");
    }
    return channels;
    }
    public void setChannels(String[] channels) {
    if (channels.length > jumlahChannel){
	System.out.println("Maaf TV ini hanya dapat menyimpan "+jumlahChannel+
			" channel");
        }
    else {
	this.channels = channels;
	System.out.println("Informasi channel berhasil di update");
    }
    }
    
    public int getChannelAktif(){
    return channelAktif;
    }
    public void setChannelAktif(int channelAktif){
    if(channelAktif > channels.length){
            System.out.println("Channel yang Anda inginkan belum diset !");
            return;
    }
    this.channelAktif = channelAktif;
    System.out.println("Pindah channel ke : " +channels[channelAktif]);
    }

    public int getVolume(){
    return volume;
    }
    public void setVolume(int volume){
    this.volume = volume;
    System.out.println("Intensitas Volume sekarang : "+volume);
    }
}