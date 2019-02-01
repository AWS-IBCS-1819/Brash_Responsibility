public class Axolotl extends Amphibia{

public String thickarms;
public String featherygills;
public String shortlimbs;


public Axolotl (
    String startThinskin,
    String startGlandular,
    String startMagid,
    String startTetrapods,
    String startThickarms,
    String startFeatherygills,
    String startShortlimbs){
super(startThinskin, startGlandular, startMagid, startTetrapods);
   thickarms = startThickarms;
   featherygills = startFeatherygills;
   shortlimbs = startShortlimbs;
 }

public void setThickarms(String newName){
  thickarms = newName;
}
public void setFeatherygills(String newName){
  featherygills = newName;
}
public void setShortlimbs(String newName){
  shortlimbs = newName;
}
public static void main(String[] args) {
  Axolotl a = new Axolotl("Biggest Loser","Slimy","No scales","4 leg","thickems","flower boy","smol");
  System.out.print(a.thickarms);
  
}


}
