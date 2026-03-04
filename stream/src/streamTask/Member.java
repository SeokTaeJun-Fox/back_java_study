package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Member {
	private Long id;
	private String name;
	private ArrayList<String> hobby;
	private String introduce;
		
	public Member() {;}
	public Member(Long id, String name, ArrayList<String> hobby, String introduce) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}
	
	public Member(Long id, String name, String hobby, String introduce) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = new ArrayList<String>(Arrays.asList(hobby.split("\\_")));
		this.introduce = introduce;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
}
