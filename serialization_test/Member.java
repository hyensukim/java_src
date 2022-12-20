package serialization_test;

import java.io.*;

public class Member implements Serializable{
	private String memberId;
	private transient String memberPass;
	private String killing;
	private int nums;
	
	public Member(String memberId, String memberPass) {
		super();
		this.memberId = memberId;
		this.memberPass = memberPass;
	}
	
	public String getmemberId() {
		return memberId;
	}
	public void setmemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getmemberPass() {
		return memberPass;
	}
	public void setmemberPass(String memberPass) {
		this.memberPass = memberPass;
	}
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPass=" + memberPass + "]";
	}
}
