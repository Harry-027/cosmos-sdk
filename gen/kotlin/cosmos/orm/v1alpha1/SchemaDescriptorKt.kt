//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/orm/v1alpha1/schema.proto

package cosmos.orm.v1alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun schemaDescriptor(block: cosmos.orm.v1alpha1.SchemaDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.SchemaDescriptor =
  cosmos.orm.v1alpha1.SchemaDescriptorKt.Dsl._create(cosmos.orm.v1alpha1.Schema.SchemaDescriptor.newBuilder()).apply { block() }._build()
public object SchemaDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.orm.v1alpha1.Schema.SchemaDescriptor = _builder.build()

    /**
     * <pre>
     * files is the set of all FileDescriptorProto's needed to decode the stored data.
     * A schema imposes the constraint that every file and every table within that
     * schema have at most one instance in the store.
     * </pre>
     *
     * <code>.google.protobuf.FileDescriptorSet files = 1 [json_name = "files"];</code>
     */
    public var files: com.google.protobuf.DescriptorProtos.FileDescriptorSet
      @JvmName("getFiles")
      get() = _builder.getFiles()
      @JvmName("setFiles")
      set(value) {
        _builder.setFiles(value)
      }
    /**
     * <pre>
     * files is the set of all FileDescriptorProto's needed to decode the stored data.
     * A schema imposes the constraint that every file and every table within that
     * schema have at most one instance in the store.
     * </pre>
     *
     * <code>.google.protobuf.FileDescriptorSet files = 1 [json_name = "files"];</code>
     */
    public fun clearFiles() {
      _builder.clearFiles()
    }
    /**
     * <pre>
     * files is the set of all FileDescriptorProto's needed to decode the stored data.
     * A schema imposes the constraint that every file and every table within that
     * schema have at most one instance in the store.
     * </pre>
     *
     * <code>.google.protobuf.FileDescriptorSet files = 1 [json_name = "files"];</code>
     * @return Whether the files field is set.
     */
    public fun hasFiles(): kotlin.Boolean {
      return _builder.hasFiles()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ModulesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * modules is the set of modules in the schema.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.ModuleEntry modules = 2 [json_name = "modules"];</code>
     */
     public val modules: com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry, ModulesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getModulesList()
      )
    /**
     * <pre>
     * modules is the set of modules in the schema.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.ModuleEntry modules = 2 [json_name = "modules"];</code>
     * @param value The modules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addModules")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry, ModulesProxy>.add(value: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry) {
      _builder.addModules(value)
    }/**
     * <pre>
     * modules is the set of modules in the schema.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.ModuleEntry modules = 2 [json_name = "modules"];</code>
     * @param value The modules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignModules")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry, ModulesProxy>.plusAssign(value: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry) {
      add(value)
    }/**
     * <pre>
     * modules is the set of modules in the schema.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.ModuleEntry modules = 2 [json_name = "modules"];</code>
     * @param values The modules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllModules")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry, ModulesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry>) {
      _builder.addAllModules(values)
    }/**
     * <pre>
     * modules is the set of modules in the schema.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.ModuleEntry modules = 2 [json_name = "modules"];</code>
     * @param values The modules to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllModules")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry, ModulesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry>) {
      addAll(values)
    }/**
     * <pre>
     * modules is the set of modules in the schema.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.ModuleEntry modules = 2 [json_name = "modules"];</code>
     * @param index The index to set the value at.
     * @param value The modules to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setModules")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry, ModulesProxy>.set(index: kotlin.Int, value: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry) {
      _builder.setModules(index, value)
    }/**
     * <pre>
     * modules is the set of modules in the schema.
     * </pre>
     *
     * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.ModuleEntry modules = 2 [json_name = "modules"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearModules")
    public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry, ModulesProxy>.clear() {
      _builder.clearModules()
    }}
  @kotlin.jvm.JvmSynthetic
  public inline fun moduleEntry(block: cosmos.orm.v1alpha1.SchemaDescriptorKt.ModuleEntryKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry =
    cosmos.orm.v1alpha1.SchemaDescriptorKt.ModuleEntryKt.Dsl._create(cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry.newBuilder()).apply { block() }._build()
  public object ModuleEntryKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry = _builder.build()

      /**
       * <pre>
       * name is the name of the module. In the multi-store model this name is
       * used to locate the module's store.
       * </pre>
       *
       * <code>string name = 1 [json_name = "name"];</code>
       */
      public var name: kotlin.String
        @JvmName("getName")
        get() = _builder.getName()
        @JvmName("setName")
        set(value) {
          _builder.setName(value)
        }
      /**
       * <pre>
       * name is the name of the module. In the multi-store model this name is
       * used to locate the module's store.
       * </pre>
       *
       * <code>string name = 1 [json_name = "name"];</code>
       */
      public fun clearName() {
        _builder.clearName()
      }

      /**
       * <pre>
       * prefix is an optional prefix that precedes all keys in this module's
       * store.
       * </pre>
       *
       * <code>bytes prefix = 2 [json_name = "prefix"];</code>
       */
      public var prefix: com.google.protobuf.ByteString
        @JvmName("getPrefix")
        get() = _builder.getPrefix()
        @JvmName("setPrefix")
        set(value) {
          _builder.setPrefix(value)
        }
      /**
       * <pre>
       * prefix is an optional prefix that precedes all keys in this module's
       * store.
       * </pre>
       *
       * <code>bytes prefix = 2 [json_name = "prefix"];</code>
       */
      public fun clearPrefix() {
        _builder.clearPrefix()
      }

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class FilesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * <pre>
       * files describes the schema files used in this module.
       * </pre>
       *
       * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.FileEntry files = 3 [json_name = "files"];</code>
       */
       public val files: com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry, FilesProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getFilesList()
        )
      /**
       * <pre>
       * files describes the schema files used in this module.
       * </pre>
       *
       * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.FileEntry files = 3 [json_name = "files"];</code>
       * @param value The files to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addFiles")
      public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry, FilesProxy>.add(value: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry) {
        _builder.addFiles(value)
      }/**
       * <pre>
       * files describes the schema files used in this module.
       * </pre>
       *
       * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.FileEntry files = 3 [json_name = "files"];</code>
       * @param value The files to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignFiles")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry, FilesProxy>.plusAssign(value: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry) {
        add(value)
      }/**
       * <pre>
       * files describes the schema files used in this module.
       * </pre>
       *
       * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.FileEntry files = 3 [json_name = "files"];</code>
       * @param values The files to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllFiles")
      public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry, FilesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry>) {
        _builder.addAllFiles(values)
      }/**
       * <pre>
       * files describes the schema files used in this module.
       * </pre>
       *
       * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.FileEntry files = 3 [json_name = "files"];</code>
       * @param values The files to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllFiles")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry, FilesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry>) {
        addAll(values)
      }/**
       * <pre>
       * files describes the schema files used in this module.
       * </pre>
       *
       * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.FileEntry files = 3 [json_name = "files"];</code>
       * @param index The index to set the value at.
       * @param value The files to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setFiles")
      public operator fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry, FilesProxy>.set(index: kotlin.Int, value: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry) {
        _builder.setFiles(index, value)
      }/**
       * <pre>
       * files describes the schema files used in this module.
       * </pre>
       *
       * <code>repeated .cosmos.orm.v1alpha1.SchemaDescriptor.FileEntry files = 3 [json_name = "files"];</code>
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearFiles")
      public fun com.google.protobuf.kotlin.DslList<cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry, FilesProxy>.clear() {
        _builder.clearFiles()
      }}
  }
  @kotlin.jvm.JvmSynthetic
  public inline fun fileEntry(block: cosmos.orm.v1alpha1.SchemaDescriptorKt.FileEntryKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry =
    cosmos.orm.v1alpha1.SchemaDescriptorKt.FileEntryKt.Dsl._create(cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry.newBuilder()).apply { block() }._build()
  public object FileEntryKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry = _builder.build()

      /**
       * <pre>
       * id is a prefix that will be varint encoded and prepended to all the
       * table keys specified in the file's tables.
       * </pre>
       *
       * <code>uint32 id = 1 [json_name = "id"];</code>
       */
      public var id: kotlin.Int
        @JvmName("getId")
        get() = _builder.getId()
        @JvmName("setId")
        set(value) {
          _builder.setId(value)
        }
      /**
       * <pre>
       * id is a prefix that will be varint encoded and prepended to all the
       * table keys specified in the file's tables.
       * </pre>
       *
       * <code>uint32 id = 1 [json_name = "id"];</code>
       */
      public fun clearId() {
        _builder.clearId()
      }

      /**
       * <pre>
       * file_name is the name of a file in the FileDescriptor set that contains
       * table definitions.
       * </pre>
       *
       * <code>string file_name = 2 [json_name = "fileName"];</code>
       */
      public var fileName: kotlin.String
        @JvmName("getFileName")
        get() = _builder.getFileName()
        @JvmName("setFileName")
        set(value) {
          _builder.setFileName(value)
        }
      /**
       * <pre>
       * file_name is the name of a file in the FileDescriptor set that contains
       * table definitions.
       * </pre>
       *
       * <code>string file_name = 2 [json_name = "fileName"];</code>
       */
      public fun clearFileName() {
        _builder.clearFileName()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Schema.SchemaDescriptor.copy(block: cosmos.orm.v1alpha1.SchemaDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.SchemaDescriptor =
  cosmos.orm.v1alpha1.SchemaDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry.copy(block: cosmos.orm.v1alpha1.SchemaDescriptorKt.ModuleEntryKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.SchemaDescriptor.ModuleEntry =
  cosmos.orm.v1alpha1.SchemaDescriptorKt.ModuleEntryKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry.copy(block: cosmos.orm.v1alpha1.SchemaDescriptorKt.FileEntryKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Schema.SchemaDescriptor.FileEntry =
  cosmos.orm.v1alpha1.SchemaDescriptorKt.FileEntryKt.Dsl._create(this.toBuilder()).apply { block() }._build()