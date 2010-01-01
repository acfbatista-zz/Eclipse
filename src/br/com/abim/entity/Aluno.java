package br.com.abim.entity;

public class Aluno implements IPessoa {

	private Long Id;
	private String Nome;

	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#getId()
	 */
	@Override
	public Long getId() {
		return Id;
	}

	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#setId(java.lang.Long)
	 */
	@Override
	public void setId(Long id) {
		Id = id;
	}

	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#getNome()
	 */
	@Override
	public String getNome() {
		return Nome;
	}

	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		Nome = nome;
	}

	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#toString()
	 */
	@Override
	public String toString() {
		return "A pessoa é [Id=" + Id + ", Nome=" + Nome + "]";
	}

}