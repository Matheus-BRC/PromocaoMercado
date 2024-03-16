[caixa]
[compra]
[produto]

[caixa|-lance: double | +verificaLance(lance: double): int; +aplicaDesconto(): double]
[compra||-somaProdutos(): double]
[produto|-nome: String; -quantidade: int; -preco: double|]

[caixa]->[compra]
[compra]->*[produto]
