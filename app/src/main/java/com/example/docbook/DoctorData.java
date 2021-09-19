package com.example.docbook;

public class DoctorData {
        String name;
        String mbbsFrom;
        String additionalDegree;
        String specialistOn;
        String clinicAddress;
        String location;
        int img;

    public DoctorData() {
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DoctorData(String name, String mbbsFrom, String additionalDegree, String specialistOn, String clinicAddress, String location, int img) {
        this.name = name;
        this.mbbsFrom = mbbsFrom;
        this.additionalDegree = additionalDegree;
        this.specialistOn = specialistOn;
        this.clinicAddress = clinicAddress;
        this.location = location;
        this.img = img;
    }

    public DoctorData(String name, String mbbsFrom, String additionalDegree, String specialistOn, int img) {
            this.name = name;
            this.mbbsFrom = mbbsFrom;
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
            return mbbsFrom;
        }

        public void setMbbsFrom(String mbbsFrom) {
            this.mbbsFrom = mbbsFrom;
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

