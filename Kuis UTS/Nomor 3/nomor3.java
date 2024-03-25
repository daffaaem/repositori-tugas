public class nomor3 {
    private String golongan3a, golongan3b, golongan3c, golongan3d, golongan4a, golongan4b, golongan4c, golongan4d;
    private int gs3a, gs3b, gs3c, gs3d, gs4a, gs4b, gs4c, gs4d;
    private int gp3a, gp3b, gp3c, gp3d, gp4a, gp4b, gp4c, gp4d;
    private int tunjangan3a, tunjangan3b, tunjangan3c, tunjangan3d, tunjangan4a, tunjangan4b, tunjangan4c, tunjangan4d;
    private int thr3a, thr3b, thr3c, thr3d, thr4a, thr4b, thr4c, thr4d;
    private int gt3a, gt3b, gt3c, gt3d, gt4a, gt4b, gt4c, gt4d;
    private int bonus3a, bonus3b, bonus3c, bonus3d, bonus4a, bonus4b, bonus4c, bonus4d;
    private int tp3a, tp3b, tp3c, tp3d, tp4a, tp4b, tp4c, tp4d;
    private int pajak3a, pajak3b, pajak3c, pajak3d, pajak4a, pajak4b, pajak4c, pajak4d;

    // Golongan III A
    public void setGolongan3a(String golongan3a){
        this.golongan3a = golongan3a;
    }

    public String getGolongan3a(){
        return golongan3a;
    }

    public void setGs3a(int gs3a){
        this.gs3a = gs3a;
    }

    public int getGs3a(){
        return gs3a;
    }

    public void setGp3a(int gs3a){
        gp3a = gs3a * 12;
    }

    public int getGp3a(){
        return gp3a;
    }

    public void setTunjangan3a(int gs3a){
        tunjangan3a = gs3a * 60 / 100;
    }

    public int getTunjangan3a(){
        return tunjangan3a;
    }

    public void setThr3a(int gs3a){
        thr3a = gs3a * 1;
    }

    public int getThr3a(){
        return thr3a;
    }

    public void setGt3a(int gs3a){
        gt3a = gs3a * 1;
    }

    public int getGt3a(){
        return gt3a;
    }

    public void setBonus3a(int gs3a){
        bonus3a = gs3a * 12 / 10 * 2;
    }

    public int getBonus3a(){
        return bonus3a;
    }

    public void setPajak3a(int gs3a, int tunjangan3a, int thr3a, int gt3a, int bonus3a){
        if((gs3a + (tunjangan3a / 12) + (bonus3a / 12) + (thr3a / 12) + gt3a) > 5000000){
            pajak3a = (gp3a + tunjangan3a + bonus3a + thr3a + gt3a) * 6 / 100;
        } else {
            pajak3a = 0;
        }
    }
    
    public int getPajak3a(){
        return pajak3a;
    }

    public void setTp3a(int Gs3a, int Tunjangan3a, int Thr3a, int Gt3a, int Bonus3a){
        tp3a = Gs3a + Tunjangan3a + Thr3a + Gt3a + Bonus3a;
    }

    public int getTp3a(){
        return tp3a;
    }


    // Golongan III B
        public void setGolongan3b(String golongan3b){
            this.golongan3b = golongan3b;
        }
    
        public String getGolongan3b(){
            return golongan3b;
        }
    
    
        public void setGs3b(int gs3b){
            this.gs3b = gs3b;
        }
    
        public int getGs3b(){
            return gs3b;
        }
    
        public void setGp3b(int gs3b){
            gp3b = gs3b * 12;
        }
    
        public int getGp3b(){
            return gp3b;
        }
    
        public void setTunjangan3b(int gs3b){
            tunjangan3b = gs3b * 60 / 100;
        }
    
        public int getTunjangan3b(){
            return tunjangan3b;
        }
    
        public void setThr3b(int gs3b){
            thr3b = gs3b * 1;
        }
    
        public int getThr3b(){
            return thr3b;
        }
    
        public void setGt3b(int gs3b){
            gt3b = gs3b * 1;
        }
    
        public int getGt3b(){
            return gt3b;
        }
    
        public void setBonus3b(int gs3b){
            bonus3b = gs3b * 15 / 10 * 2;
        }
    
        public int getBonus3b(){
            return bonus3b;
        }
        
        public void setPajak3b(int gs3b, int tunjangan3b, int thr3b, int gt3b, int bonus3b){
            if((gs3b + (tunjangan3b / 12) + (bonus3b / 12) + (thr3b / 12) + gt3b) > 5000000){
                pajak3b = (gp3b + tunjangan3b + bonus3b + thr3b + gt3b) * 6 / 100;
            } else {
                pajak3b = 0;
            }
        }
        
        public int getPajak3b(){
            return pajak3b;
        }
    
        public void setTp3b(int Gs3b, int Tunjangan3b, int Thr3b, int Gt3b, int Bonus3b){
            tp3b = Gs3b + Tunjangan3b + Thr3b + Gt3b + Bonus3b;
        }
    
        public int getTp3b(){
            return tp3b;
        }


    // Golongan III C
    public void setGolongan3c(String golongan3c){
        this.golongan3c = golongan3c;
    }

    public String getGolongan3c(){
        return golongan3c;
    }

    public void setGs3c(int gs3c){
        this.gs3c = gs3c;
    }

    public int getGs3c(){
        return gs3c;
    }

    public void setGp3c(int gs3c){
        gp3c = gs3c * 12;
    }

    public int getGp3c(){
        return gp3c;
    }

    public void setTunjangan3c(int gs3c){
        tunjangan3c = gs3c * 60 / 100;
    }

    public int getTunjangan3c(){
        return tunjangan3c;
    }

    public void setThr3c(int gs3c){
        thr3c = gs3c * 1;
    }

    public int getThr3c(){
        return thr3c;
    }

    public void setGt3c(int gs3c){
        gt3c = gs3c * 1;
    }

    public int getGt3c(){
        return gt3c;
    }

    public void setBonus3c(int gs3c){
        bonus3c = gs3c * 15 / 10 * 2;
    }

    public int getBonus3c(){
        return bonus3c;
    }

    public void setPajak3c(int gs3c, int tunjangan3c, int thr3c, int gt3c, int bonus3c){
        if((gs3c + (tunjangan3c / 12) + (bonus3c / 12) + (thr3c / 12) + gt3c) > 5000000){
            pajak3c = (gp3c + tunjangan3c + bonus3c + thr3c + gt3c) * 6 / 100;
        } else {
            pajak3c = 0;
        }
    }
    
    public int getPajak3c(){
        return pajak3c;
    }

    public void setTp3c(int Gs3c, int Tunjangan3c, int Thr3c, int Gt3c, int Bonus3c){
        tp3c = Gs3c + Tunjangan3c + Thr3c + Gt3c + Bonus3c;
    }

    public int getTp3c(){
        return tp3c;
    }


    // Golongan III D
        public void setGolongan3d(String golongan3d){
            this.golongan3d = golongan3d;
        }
    
        public String getGolongan3d(){
            return golongan3d;
        }
    
        public void setGs3d(int gs3d){
            this.gs3d = gs3d;
        }
    
        public int getGs3d(){
            return gs3d;
        }
    
        public void setGp3d(int gs3d){
            gp3d = gs3d * 12;
        }
    
        public int getGp3d(){
            return gp3d;
        }
    
        public void setTunjangan3d(int gs3d){
            tunjangan3d = gs3d * 100 / 100;
        }
    
        public int getTunjangan3d(){
            return tunjangan3d;
        }
    
        public void setThr3d(int gs3d){
            thr3d = gs3d * 1;
        }
    
        public int getThr3d(){
            return thr3d;
        }
    
        public void setGt3d(int gs3d){
            gt3d = gs3d * 1;
        }
    
        public int getGt3d(){
            return gt3d;
        }
    
        public void setBonus3d(int gs3d){
            bonus3d = gs3d * 2 * 2;
        }
    
        public int getBonus3d(){
            return bonus3d;
        }
    
        public void setPajak3d(int gs3d, int tunjangan3d, int thr3d, int gt3d, int bonus3d){
            if((gs3d + (tunjangan3d / 12) + (bonus3d / 12) + (thr3d / 12) + gt3d) > 5000000){
                pajak3d = (gp3d + tunjangan3d + bonus3d + thr3d + gt3d) * 6 / 100;
            } else {
                pajak3d = 0;
            }
        }
        
        public int getPajak3d(){
            return pajak3d;
        }
    
        public void setTp3d(int Gs3d, int Tunjangan3d, int Thr3d, int Gt3d, int Bonus3d){
            tp3d = Gs3d + Tunjangan3d + Thr3d + Gt3d + Bonus3d;
        }
    
        public int getTp3d(){
            return tp3d;
        }


    // Golongan IV A
    public void setGolongan4a(String golongan4a){
        this.golongan4a = golongan4a;
    }

    public String getGolongan4a(){
        return golongan4a;
    }

    public void setGs4a(int gs4a){
        this.gs4a = gs4a;
    }

    public int getGs4a(){
        return gs4a;
    }

    public void setGp4a(int gs4a){
        gp4a = gs4a * 12;
    }

    public int getGp4a(){
        return gp4a;
    }

    public void setTunjangan4a(int gs4a){
        tunjangan4a = gs4a * 110 / 100;
    }

    public int getTunjangan4a(){
        return tunjangan4a;
    }

    public void setThr4a(int gs4a){
        thr4a = gs4a * 1;
    }

    public int getThr4a(){
        return thr4a;
    }

    public void setGt4a(int gs4a){
        gt4a = gs4a * 1;
    }

    public int getGt4a(){
        return gt4a;
    }

    public void setBonus4a(int gs4a){
        bonus4a = gs4a * 25 / 10 * 2;
    }

    public int getBonus4a(){
        return bonus4a;
    }

    public void setPajak4a(int gs4a, int tunjangan4a, int thr4a, int gt4a, int bonus4a){
        if((gs4a + (tunjangan4a / 12) + (bonus4a / 12) + (thr4a / 12) + gt4a) > 5000000){
            pajak4a = (gp4a + tunjangan4a + bonus4a + thr4a + gt4a) * 6 / 100;
        } else {
            pajak4a = 0;
        }
    }
    
    public int getPajak4a(){
        return pajak4a;
    }

    public void setTp4a(int Gs4a, int Tunjangan4a, int Thr4a, int Gt4a, int Bonus4a){
        tp4a = Gs4a + Tunjangan4a + Thr4a + Gt4a + Bonus4a;
    }

    public int getTp4a(){
        return tp4a;
    }


    // Golongan IV B
        public void setGolongan4b(String golongan4b){
            this.golongan4b = golongan4b;
        }
    
        public String getGolongan4b(){
            return golongan4b;
        }
    
        public void setGs4b(int gs4b){
            this.gs4b = gs4b;
        }
    
        public int getGs4b(){
            return gs4b;
        }
    
        public void setGp4b(int gs4b){
            gp4b = gs4b * 12;
        }
    
        public int getGp4b(){
            return gp4b;
        }
    
        public void setTunjangan4b(int gs4b){
            tunjangan4b = gs4b * 60 / 100;
        }
    
        public int getTunjangan4b(){
            return tunjangan4b;
        }
    
        public void setThr4b(int gs4b){
            thr4b = gs4b * 1;
        }
    
        public int getThr4b(){
            return thr4b;
        }
    
        public void setGt4b(int gs4b){
            gt4b = gs4b * 1;
        }
    
        public int getGt4b(){
            return gt4b;
        }
    
        public void setBonus4b(int gs4b){
            bonus4b = gs4b * 25 / 10 * 2;
        }
    
        public int getBonus4b(){
            return bonus4b;
        }
        
        public void setPajak4b(int gs4b, int tunjangan4b, int thr4b, int gt4b, int bonus4b){
            if((gs4b + (tunjangan4b / 12) + (bonus4b / 12) + (thr4b / 12) + gt4b) > 5000000){
                pajak4b = (gp4b + tunjangan4b + bonus4b + thr4b + gt4b) * 6 / 100;
            } else {
                pajak4b = 0;
            }
        }
        
        public int getPajak4b(){
            return pajak4b;
        }
    
        public void setTp4b(int Gs4b, int Tunjangan4b, int Thr4b, int Gt4b, int Bonus4b){
            tp4b = Gs4b + Tunjangan4b + Thr4b + Gt4b + Bonus4b;
        }
    
        public int getTp4b(){
            return tp4b;
        }


        // Golongan IV B
        public void setGolongan4c(String golongan4c){
            this.golongan4c = golongan4c;
        }
        
        public String getGolongan4c(){
            return golongan4c;
        }
        
        public void setGs4c(int gs4c){
            this.gs4c = gs4c;
        }
        
        public int getGs4c(){
            return gs4c;
        }
        
        public void setGp4c(int gs4c){
            gp4c = gs4c * 12;
        }
        
        public int getGp4c(){
            return gp4c;
        }
    
        public void setTunjangan4c(int gs4c){
            tunjangan4c = gs4c * 150 / 100;
        }
    
        public int getTunjangan4c(){
            return tunjangan4c;
        }
    
        public void setThr4c(int gs4c){
            thr4c = gs4c * 1;
        }
    
        public int getThr4c(){
            return thr4c;
        }
    
        public void setGt4c(int gs4c){
            gt4c = gs4c * 1;
        }
    
        public int getGt4c(){
            return gt4c;
        }
    
        public void setBonus4c(int gs4c){
            bonus4c = gs4c * 8 * 2;
        }
    
        public int getBonus4c(){
            return bonus4c;
        }
    
        public void setPajak4c(int gs4c, int tunjangan4c, int thr4c, int gt4c, int bonus4c){
            if((gs4c + (tunjangan4c / 12) + (bonus4c / 12) + (thr4c / 12) + gt4c) > 5000000){
                pajak4c = (gp4c + tunjangan4c + bonus4c + thr4c + gt4c) * 6 / 100;
            } else {
                pajak4c = 0;
            }
        }
        
        public int getPajak4c(){
            return pajak4c;
        }
    
        public void setTp4c(int Gs4c, int Tunjangan4c, int Thr4c, int Gt4c, int Bonus4c){
            tp4c = Gs4c + Tunjangan4c + Thr4c + Gt4c + Bonus4c;
        }
    
        public int getTp4c(){
            return tp4c;
        }


                // Golongan IV B
        public void setGolongan4d(String golongan4d){
            this.golongan4d = golongan4d;
        }
    
        public String getGolongan4d(){
            return golongan4d;
        }
    
        public void setGs4d(int gs4d){
            this.gs4d = gs4d;
        }
    
        public int getGs4d(){
            return gs4d;
        }
    
        public void setGp4d(int gs4d){
            gp4d = gs4d * 12;
        }
    
        public int getGp4d(){
            return gp4d;
        }
    
        public void setTunjangan4d(int gs4d){
            tunjangan4d = gs4d * 150 / 100;
        }
    
        public int getTunjangan4d(){
            return tunjangan4d;
        }
    
        public void setThr4d(int gs4d){
            thr4d = gs4d * 1;
        }
    
        public int getThr4d(){
            return thr4d;
        }
    
        public void setGt4d(int gs4d){
            gt4d = gs4d * 1;
        }
    
        public int getGt4d(){
            return gt4d;
        }
    
        public void setBonus4d(int gs4d){
            bonus4d = gs4d * 10 * 2;
        }
    
        public int getBonus4d(){
            return bonus4d;
        }
    
        public void setPajak4d(int gs4d, int tunjangan4d, int thr4d, int gt4d, int bonus4d){
            if((gs4d + (tunjangan4d / 12) + (bonus4d / 12) + (thr4d / 12) + gt4d) > 5000000){
                pajak4d = (gp4d + tunjangan4d + bonus4d + thr4d + gt4d) * 6 / 100;
            } else {
                pajak4d = 0;
            }
        }
        
        public int getPajak4d(){
            return pajak4d;
        }
    
        public void setTp4d(int Gs4d, int Tunjangan4d, int Thr4d, int Gt4d, int Bonus4d){
            tp4d = Gs4d + Tunjangan4d + Thr4d + Gt4d + Bonus4d;
        }
    
        public int getTp4d(){
            return tp4d;
        }
}