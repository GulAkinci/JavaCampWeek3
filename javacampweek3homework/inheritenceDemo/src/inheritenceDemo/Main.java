package inheritenceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        TarımKrediManager tarımKrediManager =new TarımKrediManager();
        KrediUI krediUI = new KrediUI();
        ogretmenKrediManager.Hesapla();
        tarımKrediManager.Hesapla();
        krediUI.KrediHesapla(new OgretmenKrediManager());
	}

}
