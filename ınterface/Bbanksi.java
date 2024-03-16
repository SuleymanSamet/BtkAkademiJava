package ınterface;

public class Bbanksi implements IBanka{
    private String bankaAdi;
    private String terminalId;
    private String password;

    public Bbanksi(String bankaAdi,String terminal_id,String password){
        this.bankaAdi=bankaAdi;
        this.terminalId =terminal_id;
        this.password=password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip: "+ipAddress);
        System.out.println("Makine ip :"+this.hostIpAddress);
        System.out.println(this.bankaAdi+" Bağlanıldı.");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem başarılı oldu");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
