package demo;

import java.util.Scanner;

public abstract class Meo {
	private int id;
	private int tuoi;
	private int gioitinh;
	private String  ten;
	protected TiengKeu tiengKeu;
		
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setTiengKeu(TiengKeu tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public TiengKeu getTiengKeu() {
        return tiengKeu;
    }
		public Meo(int id,String ten,int tuoi,int gioitinh) {
			this.id=id;
			this.ten=ten;
			this.tuoi = tuoi;
			this.gioitinh=gioitinh;
		}
		public Meo() {
			
		}
		public void nhapMeo() {
			Scanner scanner= new Scanner(System.in);
			System.out.println("nhap id:");
			this.id=Integer.parseInt(scanner.nextLine());
			System.out.println("nhap ten:");
			this.ten=scanner.nextLine();
			System.out.println("nhap tuoi:");
			this.tuoi=Integer.parseInt(scanner.nextLine());
			System.out.println("nhap gioi tinh:");
			this.gioitinh=Integer.parseInt(scanner.nextLine());
			
		}
		public void inThongTin(){
	        System.out.println(" ID la :"+id);
	        System.out.println("Ten la :"+ten);
	        System.out.println("Tuoi "+tuoi);
	        System.out.println("Gioi tinh :"+gioitinh);
	        System.out.println("Meo keu :"+keu());
	       
	    }
		
		public String keu() {
			 return tiengKeu.tiengKeu();
		}
		
	}
	
	



 
