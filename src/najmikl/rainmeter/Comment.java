/**
 * 
 */
package najmikl.rainmeter;

/**
 * Comment in Rainmeter configuration
 * e.g. "; This is a comment"
 */
public final class Comment
{
	private String m_Comment;
	/**
	 * 
	 */
	public Comment()
	{
		m_Comment = ";";
	}
	public Comment(String comment)
	{
		setComment(comment);
	}
	public String getComment()
	{
		return m_Comment;
	}
	public void setComment(String comment)
	{
		// Strip all newlines/carriage returns and tabs
		m_Comment = "; " + comment.replaceAll("\\r\\n|\\r|\\n|\\t", " ").trim();
	}
}
