package com.pay.planner.vo;

public class MemberVO {
	private int m_id;
	private String m_pw;
	private String m_name;
	private int m_point;

	public MemberVO() {
		super();
	}

	public MemberVO(int m_id, String m_pw, String m_name, int m_point) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_point = m_point;
	}

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_point() {
		return m_point;
	}

	public void setM_point(int m_point) {
		this.m_point = m_point;
	}

//
//	//pw 추가 되어야 함!  추가 부탁드려요~~~
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((address == null) ? 0 : address.hashCode());
//		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + likes;
//		result = prime * result + ((member_account == null) ? 0 : member_account.hashCode());
//		result = prime * result + member_id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
//		result = prime * result + score;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MemberVO other = (MemberVO) obj;
//		if (address == null) {
//			if (other.address != null)
//				return false;
//		} else if (!address.equals(other.address))
//			return false;
//		if (birth == null) {
//			if (other.birth != null)
//				return false;
//		} else if (!birth.equals(other.birth))
//			return false;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (likes != other.likes)
//			return false;
//		if (member_account == null) {
//			if (other.member_account != null)
//				return false;
//		} else if (!member_account.equals(other.member_account))
//			return false;
//		if (member_id != other.member_id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (phone == null) {
//			if (other.phone != null)
//				return false;
//		} else if (!phone.equals(other.phone))
//			return false;
//		if (score != other.score)
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "MemberVO [m_id=" + m_id + ", m_pw=" + m_pw + ", m_name=" + m_name + ", m_point=" + m_point
				+ ", getM_id()=" + getM_id() + ", getM_pw()=" + getM_pw() + ", getM_name()=" + getM_name()
				+ ", getM_point()=" + getM_point() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}