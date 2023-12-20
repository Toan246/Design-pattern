package bai1;

class Individual implements Person {
    private String name;
    private String birthDate;
    private String gender;
    private Couple couple;

    public Individual(String name, String birthDate, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.couple = null;
    }

    public void setCouple(Couple couple) {
        this.couple = couple;
    }

    public Couple getCouple() {
        return couple;
    }

    @Override
    public String getInfo() {
        return "Name: " + name + ", Birth Date: " + birthDate + ", Gender: " + gender;
    }
}

