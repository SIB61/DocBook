package com.example.docbook;

public class DoctorData {
        String name;
        String MbbsFrom;
        String additionalDegree;
        String specialistOn;
        int img;

        public DoctorData(String name, String MbbsFrom, String additionalDegree, String specialistOn, int img) {
            this.name = name;
            this.MbbsFrom = MbbsFrom;
            this.additionalDegree = additionalDegree;
            this.specialistOn = specialistOn;
            this.img = img;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMbbsFrom() {
            return MbbsFrom;
        }

        public void setMbbsFrom(String mbbsFrom) {
            MbbsFrom = mbbsFrom;
        }

        public String getAdditionalDegree() {
            return additionalDegree;
        }

        public void setAdditionalDegree(String additionalDegree) {
            this.additionalDegree = additionalDegree;
        }

        public String getSpecialistOn() {
            return specialistOn;
        }

        public void setSpecialistOn(String specialistOn) {
           this.specialistOn = specialistOn;
        }

        public int getImg() {
            return img;
        }

        public void setImg(int img) {
            this.img = img;
        }
    }

