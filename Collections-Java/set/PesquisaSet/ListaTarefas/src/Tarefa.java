public class Tarefa {

    private String descricao;
    private boolean executada;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.executada = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isExecutada() {
        return executada;
    }

    public void setExecutada(boolean executada) {
        this.executada = executada;
    }

    @Override
    public String toString() {
        return "descricao=" + descricao + ", executada=" + executada + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

}
