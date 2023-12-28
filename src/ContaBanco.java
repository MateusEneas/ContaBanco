public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public ContaBanco(int numConta, String tipo, String dono, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipoConta) {
        this.setTipo(tipoConta);
        this.setStatus(true);
        if (tipoConta == "CC") {
            this.setSaldo(50);
            System.out.println("Sua conta foi aberta e você ganhou R$50,00 de bônus!");
        } else if (tipoConta == "CP") {
            this.setSaldo(150);
            System.out.println("Sua conta foi aberta e você ganhou R$150,00 de bônus!");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada!");
        }

    }

    public void depositar(double valor) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta "  + this.dono);
        } else {
            System.out.println("Impossível depositar em conta encerrada!");
        }
    }

    public void sacar(double valor) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor && this.getSaldo() != 0) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar em uma conta encerrada!");
        }
    }

    public void pagarMensal() {
        int valor = 0;
        if (this.getTipo() == "CC") {
            valor = 12;
        } else if (this.getTipo() == "CP") {
            valor = 20;
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Sua conta está encerrada!");
        }
    }

    public void estadoAtual() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono : " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("-----------------------------------");
    }
}
