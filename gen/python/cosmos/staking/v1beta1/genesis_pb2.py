# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/staking/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.staking.v1beta1 import staking_pb2 as cosmos_dot_staking_dot_v1beta1_dot_staking__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$cosmos/staking/v1beta1/genesis.proto\x12\x16\x63osmos.staking.v1beta1\x1a\x14gogoproto/gogo.proto\x1a$cosmos/staking/v1beta1/staking.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\xf7\x04\n\x0cGenesisState\x12<\n\x06params\x18\x01 \x01(\x0b\x32\x1e.cosmos.staking.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12X\n\x10last_total_power\x18\x02 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0elastTotalPower\x12\x64\n\x15last_validator_powers\x18\x03 \x03(\x0b\x32*.cosmos.staking.v1beta1.LastValidatorPowerB\x04\xc8\xde\x1f\x00R\x13lastValidatorPowers\x12G\n\nvalidators\x18\x04 \x03(\x0b\x32!.cosmos.staking.v1beta1.ValidatorB\x04\xc8\xde\x1f\x00R\nvalidators\x12J\n\x0b\x64\x65legations\x18\x05 \x03(\x0b\x32\".cosmos.staking.v1beta1.DelegationB\x04\xc8\xde\x1f\x00R\x0b\x64\x65legations\x12\x66\n\x15unbonding_delegations\x18\x06 \x03(\x0b\x32+.cosmos.staking.v1beta1.UnbondingDelegationB\x04\xc8\xde\x1f\x00R\x14unbondingDelegations\x12P\n\rredelegations\x18\x07 \x03(\x0b\x32$.cosmos.staking.v1beta1.RedelegationB\x04\xc8\xde\x1f\x00R\rredelegations\x12\x1a\n\x08\x65xported\x18\x08 \x01(\x08R\x08\x65xported\"h\n\x12LastValidatorPower\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x14\n\x05power\x18\x02 \x01(\x03R\x05power:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42.Z,github.com/cosmos/cosmos-sdk/x/staking/typesb\x06proto3')



_GENESISSTATE = DESCRIPTOR.message_types_by_name['GenesisState']
_LASTVALIDATORPOWER = DESCRIPTOR.message_types_by_name['LastValidatorPower']
GenesisState = _reflection.GeneratedProtocolMessageType('GenesisState', (_message.Message,), {
  'DESCRIPTOR' : _GENESISSTATE,
  '__module__' : 'cosmos.staking.v1beta1.genesis_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.GenesisState)
  })
_sym_db.RegisterMessage(GenesisState)

LastValidatorPower = _reflection.GeneratedProtocolMessageType('LastValidatorPower', (_message.Message,), {
  'DESCRIPTOR' : _LASTVALIDATORPOWER,
  '__module__' : 'cosmos.staking.v1beta1.genesis_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.LastValidatorPower)
  })
_sym_db.RegisterMessage(LastValidatorPower)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z,github.com/cosmos/cosmos-sdk/x/staking/types'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['last_total_power']._options = None
  _GENESISSTATE.fields_by_name['last_total_power']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _GENESISSTATE.fields_by_name['last_validator_powers']._options = None
  _GENESISSTATE.fields_by_name['last_validator_powers']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['validators']._options = None
  _GENESISSTATE.fields_by_name['validators']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['delegations']._options = None
  _GENESISSTATE.fields_by_name['delegations']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['unbonding_delegations']._options = None
  _GENESISSTATE.fields_by_name['unbonding_delegations']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['redelegations']._options = None
  _GENESISSTATE.fields_by_name['redelegations']._serialized_options = b'\310\336\037\000'
  _LASTVALIDATORPOWER.fields_by_name['address']._options = None
  _LASTVALIDATORPOWER.fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _LASTVALIDATORPOWER._options = None
  _LASTVALIDATORPOWER._serialized_options = b'\210\240\037\000\350\240\037\000'
  _GENESISSTATE._serialized_start=152
  _GENESISSTATE._serialized_end=783
  _LASTVALIDATORPOWER._serialized_start=785
  _LASTVALIDATORPOWER._serialized_end=889
# @@protoc_insertion_point(module_scope)