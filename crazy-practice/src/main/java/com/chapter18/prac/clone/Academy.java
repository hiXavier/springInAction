package com.chapter18.prac.clone;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/3/10
 */
public class Academy implements Cloneable {

    private int academyNo;

    private String academyName;

    private Specialty specialty;

    public int getAcademyNo() {
        return academyNo;
    }

    public void setAcademyNo(int academyNo) {
        this.academyNo = academyNo;
    }

    public String getAcademyName() {
        return academyName;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Academy academy = new Academy();
        academy.setAcademyName("软件学院");
        academy.setAcademyNo(23);
        Specialty specialty = new Specialty();
        specialty.setSpecialtyName("软件工程");
        specialty.setSpecialtyNo(1);
        academy.setSpecialty(specialty);

        Academy academyClone = (Academy)academy.clone();
        academyClone.setAcademyNo(24);
        academyClone.setAcademyName("信息学院");
        Specialty specialty2 = academyClone.getSpecialty();
        specialty2.setSpecialtyName("计算机科学与技术");
        specialty2.setSpecialtyNo(2);

        System.out.println("academy=" + academy.toString());
        System.out.println("academyClone=" + academyClone.toString());
    }

    @Override
    public String toString(){
        return  ("[academy=" + super.toString() + "academyNo=" + academyNo + ",academyName=" + academyName
        + "specialty=" + super.toString() + "specialtyNo= " + specialty.getSpecialtyNo() + ",specialtyName= " + specialty.getSpecialtyName());
    }
}

