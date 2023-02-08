public class Message
{
	private final String msg;
	private final Utilisateur auth;
	Message(String strmsg, Utilisateur util)
	{
		this.msg = strmsg;
		this.auth = util;
	}
	public String getMsg()
	{
		return(this.msg);
	}
	public Utilisateur getAuth()
	{
		return(this.auth);
	}
}
