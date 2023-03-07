/*
 * File      : OperasiTitik.java	(07/03/23)	
 * Penulis   : Yoda Rachman Nur Sahid
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 */

class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		titik.setAbsis(-titik.getAbsis());
	}
	
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
}