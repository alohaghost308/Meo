package demo;

import java.util.List;
public interface MeoChucNang {
	String themMeo();
    String xoaMeoTheoID(int id);
    List<Meo> getMeo();
    List<Meo> hienThi();
    List<Meo> hienThiTheoID(int id);
    String thayDoiTiengKeu(int id,TiengKeu tiengKeu);
}
