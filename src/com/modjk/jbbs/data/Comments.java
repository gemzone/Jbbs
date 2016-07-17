/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data;

public class Comments extends Result
{
	public long comment_id;
	public long post_id;
	public long user_id;
	public String name;
	public String text;
	public String ip;
	public boolean is_hide;
	public String register_time;
}
