package com.membershiprenewal.model;

import java.time.LocalDate;

public class Member {
    private String name;
    private LocalDate expiryDate;
    private MembershipType membershipType;

    public Member(String name, LocalDate expiryDate, MembershipType membershipType) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.membershipType = membershipType;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void renewMembership(int duration) {
        expiryDate = expiryDate.plusYears(duration);
    }
}
