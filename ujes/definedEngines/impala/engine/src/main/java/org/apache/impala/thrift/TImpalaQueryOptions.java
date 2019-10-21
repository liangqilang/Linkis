/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.impala.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-12")
public enum TImpalaQueryOptions implements org.apache.thrift.TEnum {
  ABORT_ON_ERROR(0),
  MAX_ERRORS(1),
  DISABLE_CODEGEN(2),
  BATCH_SIZE(3),
  MEM_LIMIT(4),
  NUM_NODES(5),
  MAX_SCAN_RANGE_LENGTH(6),
  MAX_IO_BUFFERS(7),
  NUM_SCANNER_THREADS(8),
  ALLOW_UNSUPPORTED_FORMATS(9),
  DEFAULT_ORDER_BY_LIMIT(10),
  DEBUG_ACTION(11),
  ABORT_ON_DEFAULT_LIMIT_EXCEEDED(12),
  COMPRESSION_CODEC(13),
  SEQ_COMPRESSION_MODE(14),
  HBASE_CACHING(15),
  HBASE_CACHE_BLOCKS(16),
  PARQUET_FILE_SIZE(17),
  EXPLAIN_LEVEL(18),
  SYNC_DDL(19),
  REQUEST_POOL(20),
  V_CPU_CORES(21),
  RESERVATION_REQUEST_TIMEOUT(22),
  DISABLE_CACHED_READS(23),
  DISABLE_OUTERMOST_TOPN(24),
  RM_INITIAL_MEM(25),
  QUERY_TIMEOUT_S(26),
  BUFFER_POOL_LIMIT(27),
  APPX_COUNT_DISTINCT(28),
  DISABLE_UNSAFE_SPILLS(29),
  EXEC_SINGLE_NODE_ROWS_THRESHOLD(30),
  OPTIMIZE_PARTITION_KEY_SCANS(31),
  REPLICA_PREFERENCE(32),
  SCHEDULE_RANDOM_REPLICA(33),
  SCAN_NODE_CODEGEN_THRESHOLD(34),
  DISABLE_STREAMING_PREAGGREGATIONS(35),
  RUNTIME_FILTER_MODE(36),
  RUNTIME_BLOOM_FILTER_SIZE(37),
  RUNTIME_FILTER_WAIT_TIME_MS(38),
  DISABLE_ROW_RUNTIME_FILTERING(39),
  MAX_NUM_RUNTIME_FILTERS(40),
  PARQUET_ANNOTATE_STRINGS_UTF8(41),
  PARQUET_FALLBACK_SCHEMA_RESOLUTION(42),
  MT_DOP(43),
  S3_SKIP_INSERT_STAGING(44),
  RUNTIME_FILTER_MAX_SIZE(45),
  RUNTIME_FILTER_MIN_SIZE(46),
  PREFETCH_MODE(47),
  STRICT_MODE(48),
  SCRATCH_LIMIT(49),
  ENABLE_EXPR_REWRITES(50),
  DECIMAL_V2(51),
  PARQUET_DICTIONARY_FILTERING(52),
  PARQUET_ARRAY_RESOLUTION(53),
  PARQUET_READ_STATISTICS(54),
  DEFAULT_JOIN_DISTRIBUTION_MODE(55),
  DISABLE_CODEGEN_ROWS_THRESHOLD(56),
  DEFAULT_SPILLABLE_BUFFER_SIZE(57),
  MIN_SPILLABLE_BUFFER_SIZE(58),
  MAX_ROW_SIZE(59),
  IDLE_SESSION_TIMEOUT(60),
  COMPUTE_STATS_MIN_SAMPLE_SIZE(61),
  EXEC_TIME_LIMIT_S(62),
  SHUFFLE_DISTINCT_EXPRS(63),
  MAX_MEM_ESTIMATE_FOR_ADMISSION(64),
  THREAD_RESERVATION_LIMIT(65),
  THREAD_RESERVATION_AGGREGATE_LIMIT(66),
  KUDU_READ_MODE(67),
  ALLOW_ERASURE_CODED_FILES(68),
  TIMEZONE(69),
  SCAN_BYTES_LIMIT(70),
  CPU_LIMIT_S(71),
  TOPN_BYTES_LIMIT(72),
  CLIENT_IDENTIFIER(73),
  RESOURCE_TRACE_RATIO(74),
  NUM_REMOTE_EXECUTOR_CANDIDATES(75),
  NUM_ROWS_PRODUCED_LIMIT(76),
  PLANNER_TESTCASE_MODE(77),
  DEFAULT_FILE_FORMAT(78);

  private final int value;

  private TImpalaQueryOptions(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TImpalaQueryOptions findByValue(int value) { 
    switch (value) {
      case 0:
        return ABORT_ON_ERROR;
      case 1:
        return MAX_ERRORS;
      case 2:
        return DISABLE_CODEGEN;
      case 3:
        return BATCH_SIZE;
      case 4:
        return MEM_LIMIT;
      case 5:
        return NUM_NODES;
      case 6:
        return MAX_SCAN_RANGE_LENGTH;
      case 7:
        return MAX_IO_BUFFERS;
      case 8:
        return NUM_SCANNER_THREADS;
      case 9:
        return ALLOW_UNSUPPORTED_FORMATS;
      case 10:
        return DEFAULT_ORDER_BY_LIMIT;
      case 11:
        return DEBUG_ACTION;
      case 12:
        return ABORT_ON_DEFAULT_LIMIT_EXCEEDED;
      case 13:
        return COMPRESSION_CODEC;
      case 14:
        return SEQ_COMPRESSION_MODE;
      case 15:
        return HBASE_CACHING;
      case 16:
        return HBASE_CACHE_BLOCKS;
      case 17:
        return PARQUET_FILE_SIZE;
      case 18:
        return EXPLAIN_LEVEL;
      case 19:
        return SYNC_DDL;
      case 20:
        return REQUEST_POOL;
      case 21:
        return V_CPU_CORES;
      case 22:
        return RESERVATION_REQUEST_TIMEOUT;
      case 23:
        return DISABLE_CACHED_READS;
      case 24:
        return DISABLE_OUTERMOST_TOPN;
      case 25:
        return RM_INITIAL_MEM;
      case 26:
        return QUERY_TIMEOUT_S;
      case 27:
        return BUFFER_POOL_LIMIT;
      case 28:
        return APPX_COUNT_DISTINCT;
      case 29:
        return DISABLE_UNSAFE_SPILLS;
      case 30:
        return EXEC_SINGLE_NODE_ROWS_THRESHOLD;
      case 31:
        return OPTIMIZE_PARTITION_KEY_SCANS;
      case 32:
        return REPLICA_PREFERENCE;
      case 33:
        return SCHEDULE_RANDOM_REPLICA;
      case 34:
        return SCAN_NODE_CODEGEN_THRESHOLD;
      case 35:
        return DISABLE_STREAMING_PREAGGREGATIONS;
      case 36:
        return RUNTIME_FILTER_MODE;
      case 37:
        return RUNTIME_BLOOM_FILTER_SIZE;
      case 38:
        return RUNTIME_FILTER_WAIT_TIME_MS;
      case 39:
        return DISABLE_ROW_RUNTIME_FILTERING;
      case 40:
        return MAX_NUM_RUNTIME_FILTERS;
      case 41:
        return PARQUET_ANNOTATE_STRINGS_UTF8;
      case 42:
        return PARQUET_FALLBACK_SCHEMA_RESOLUTION;
      case 43:
        return MT_DOP;
      case 44:
        return S3_SKIP_INSERT_STAGING;
      case 45:
        return RUNTIME_FILTER_MAX_SIZE;
      case 46:
        return RUNTIME_FILTER_MIN_SIZE;
      case 47:
        return PREFETCH_MODE;
      case 48:
        return STRICT_MODE;
      case 49:
        return SCRATCH_LIMIT;
      case 50:
        return ENABLE_EXPR_REWRITES;
      case 51:
        return DECIMAL_V2;
      case 52:
        return PARQUET_DICTIONARY_FILTERING;
      case 53:
        return PARQUET_ARRAY_RESOLUTION;
      case 54:
        return PARQUET_READ_STATISTICS;
      case 55:
        return DEFAULT_JOIN_DISTRIBUTION_MODE;
      case 56:
        return DISABLE_CODEGEN_ROWS_THRESHOLD;
      case 57:
        return DEFAULT_SPILLABLE_BUFFER_SIZE;
      case 58:
        return MIN_SPILLABLE_BUFFER_SIZE;
      case 59:
        return MAX_ROW_SIZE;
      case 60:
        return IDLE_SESSION_TIMEOUT;
      case 61:
        return COMPUTE_STATS_MIN_SAMPLE_SIZE;
      case 62:
        return EXEC_TIME_LIMIT_S;
      case 63:
        return SHUFFLE_DISTINCT_EXPRS;
      case 64:
        return MAX_MEM_ESTIMATE_FOR_ADMISSION;
      case 65:
        return THREAD_RESERVATION_LIMIT;
      case 66:
        return THREAD_RESERVATION_AGGREGATE_LIMIT;
      case 67:
        return KUDU_READ_MODE;
      case 68:
        return ALLOW_ERASURE_CODED_FILES;
      case 69:
        return TIMEZONE;
      case 70:
        return SCAN_BYTES_LIMIT;
      case 71:
        return CPU_LIMIT_S;
      case 72:
        return TOPN_BYTES_LIMIT;
      case 73:
        return CLIENT_IDENTIFIER;
      case 74:
        return RESOURCE_TRACE_RATIO;
      case 75:
        return NUM_REMOTE_EXECUTOR_CANDIDATES;
      case 76:
        return NUM_ROWS_PRODUCED_LIMIT;
      case 77:
        return PLANNER_TESTCASE_MODE;
      case 78:
        return DEFAULT_FILE_FORMAT;
      default:
        return null;
    }
  }
}