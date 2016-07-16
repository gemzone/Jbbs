/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data;

public class User extends Result
{
	public long user_id; 
	public int group_id;
	public String id;
	public String name;
	public String email; 
	public short level; 
	public int point;
	public String comment;
	public boolean is_superadmin;
	public String register_time;
}
