/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : builder.model.Computer
   Module Description   :

   Date Created      : 2018�~1��16��
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package builder.model;

/**
 * @author 015336
 */
public abstract class Computer
{
	private String cpu;

	private String hdd;

	private String ram;

	private String mainBoard;

	private String vga;

	/**
	 * @return the cpu
	 */
	public String getCpu()
	{
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu)
	{
		this.cpu = cpu;
	}

	/**
	 * @return the hdd
	 */
	public String getHdd()
	{
		return hdd;
	}

	/**
	 * @param hdd the hdd to set
	 */
	public void setHdd(String hdd)
	{
		this.hdd = hdd;
	}

	/**
	 * @return the ram
	 */
	public String getRam()
	{
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(String ram)
	{
		this.ram = ram;
	}

	/**
	 * @return the mainBoard
	 */
	public String getMainBoard()
	{
		return mainBoard;
	}

	/**
	 * @param mainBoard the mainBoard to set
	 */
	public void setMainBoard(String mainBoard)
	{
		this.mainBoard = mainBoard;
	}

	/**
	 * @return the vga
	 */
	public String getVga()
	{
		return vga;
	}

	/**
	 * @param vga the vga to set
	 */
	public void setVga(String vga)
	{
		this.vga = vga;
	}

	public String show()
	{
		return "The spec of this computer are [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", mainBoard=" + mainBoard
				+ ", vga=" + vga + "]";
	}

	public void addPart(String component, String spec) throws Exception
	{
		switch (component)
		{
		case "cpu":
			this.setCpu(spec);
			break;
		case "hdd":
			this.setHdd(spec);
			break;
		case "ram":
			this.setRam(spec);
			break;
		case "mainBoard":
			this.setMainBoard(spec);
			break;
		case "vga":
			this.setVga(spec);
			break;
		}

	}
}
